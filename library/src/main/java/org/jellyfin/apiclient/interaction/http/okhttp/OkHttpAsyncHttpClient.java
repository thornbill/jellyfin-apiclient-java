package org.jellyfin.apiclient.interaction.http.okhttp;

import org.jellyfin.apiclient.interaction.Response;
import org.jellyfin.apiclient.interaction.http.HttpHeaders;
import org.jellyfin.apiclient.interaction.http.HttpRequest;
import org.jellyfin.apiclient.interaction.http.IAsyncHttpClient;
import org.jellyfin.apiclient.model.net.HttpException;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OkHttpAsyncHttpClient implements IAsyncHttpClient {
    private static final String AUTHORIZATION_HEADER = "X-Emby-Authorization";

    OkHttpClient okClient = new OkHttpClient();

    @Override
    public void Send(HttpRequest request, Response<String> response) {
        // Map the Jellyfin HttpRequest to an OkHttp Request
        Request.Builder builder = new Request.Builder()
                .url(request.getUrl());

        // Add request headers
        HttpHeaders headers = request.getRequestHeaders();
        for (String key : headers.keySet()) {
            builder = builder.addHeader(key, headers.get(key));
        }

        // Add auth header
        String authParam = headers.getAuthorizationParameter();
        if (authParam != null && !authParam.isEmpty()) {
            builder = builder.addHeader(AUTHORIZATION_HEADER, headers.getAuthorizationScheme() + " " + authParam);
        }

        // Set request method and body
        switch (request.getMethod().toUpperCase()) {
            case "POST":
                // Has form data
                if (request.getPostData() != null && !request.getPostData().isEmpty()) {
                    FormBody.Builder formBuilder = new FormBody.Builder();
                    for (String key : request.getPostData().keySet()) {
                        formBuilder.add(key, request.getPostData().get(key));
                    }
                    builder = builder.post(formBuilder.build());
                }
                // Has body content
                else if (request.getRequestContent() != null && !request.getRequestContent().isEmpty() &&
                        request.getRequestContentType() != null && !request.getRequestContentType().isEmpty()) {
                    RequestBody requestBody = RequestBody.create(
                            request.getRequestContent(),
                            MediaType.parse(request.getRequestContentType()));
                    builder = builder.post(requestBody);
                }
                // TODO: How do we handle POST without content???
                break;
            case "DELETE":
                builder = builder.delete();
                break;
            default:
                builder = builder.get();
        }

        // Queue async request
        okClient.newCall(builder.build()).enqueue(new Callback() {
            // TODO: Does this handle request timeouts???
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                String prefix = "OkHttp Failure: ";
                HttpException httpException = new HttpException(prefix, e);
                response.onError(httpException);
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull okhttp3.Response okHttpResponse) throws IOException {
                if (okHttpResponse.isSuccessful()) {
                    response.onResponse(okHttpResponse.body().string());
                } else {
                    String prefix = "OkHttp Request Unsuccessful: ";
                    HttpException httpException = new HttpException(prefix, new IOException("OkHttp Request Unsuccessful"));
                    httpException.setStatusCode(okHttpResponse.code());
                    // Should the headers be mapped?
                    response.onError(httpException);
                }
            }
        });
    }
}
