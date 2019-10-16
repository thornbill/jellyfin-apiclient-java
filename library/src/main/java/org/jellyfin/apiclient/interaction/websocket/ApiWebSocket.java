package org.jellyfin.apiclient.interaction.websocket;

import org.jellyfin.apiclient.interaction.ApiClient;
import org.jellyfin.apiclient.interaction.ApiEventListener;
import org.jellyfin.apiclient.interaction.EmptyResponse;
import org.jellyfin.apiclient.model.apiclient.GeneralCommandEventArgs;
import org.jellyfin.apiclient.model.entities.LibraryUpdateInfo;
import org.jellyfin.apiclient.model.logging.ILogger;
import org.jellyfin.apiclient.model.net.WebSocketMessage;
import org.jellyfin.apiclient.model.serialization.IJsonSerializer;
import org.jellyfin.apiclient.model.session.*;

import java.net.URI;
import java.net.URLEncoder;

public class ApiWebSocket implements ISocketListener {
    private IJsonSerializer jsonSerializer;
    private ILogger logger;
    private ApiEventListener apiEventListener;
    private ApiClient apiClient;
    private JavaWebSocketClient socketClient;

    public ApiWebSocket(IJsonSerializer jsonSerializer, ILogger logger, ApiEventListener apiEventListener, ApiClient apiClient) {
        this.jsonSerializer = jsonSerializer;
        this.logger = logger;
        this.apiEventListener = apiEventListener;
        this.apiClient = apiClient;
    }

    public void OpenWebSocket() {
        EnsureWebSocket();
    }

    public void EnsureWebSocket() {
        if (!IsWebSocketOpenOrConnecting()) {
            OpenInternal();
        }
    }

    private void OpenInternal() {
        String address = getWebSocketServerAddress();

        URI uri = URI.create(address);

        logger.Debug("Connecting to web socket url: " + address);

        socketClient = new JavaWebSocketClient(logger, uri, this);

        socketClient.connect();
    }

    public void onOpen() {
    }

    private String getWebSocketServerAddress() {
        return apiClient.getApiUrl().replace("http", "ws") + "/socket?api_key=" + apiClient.getAccessToken() + "&deviceId=" + URLEncoder.encode(apiClient.getDeviceId());
    }

    public void CloseWebSocket() {
        if (IsWebSocketOpen()) {
            socketClient.close();
        }
    }

    public void onClose() {
    }

    public void Close() {
        socketClient.close();
    }

    public void SendWebSocketMessage(String name, EmptyResponse response) {
        SendWebSocketMessage(name, "", response);
    }

    public void SendWebSocketMessage(String name, Object data, EmptyResponse response) {
        logger.Debug("Sending web socket message: " + name);
        WebSocketMessage<Object> msg = new WebSocketMessage<>();

        msg.setMessageType(name);
        msg.setData(data);

        String json = jsonSerializer.SerializeToString(msg);

        SendMessageInternal(json, response);
    }

    private void SendMessageInternal(String message, EmptyResponse response) {
        if (IsWebSocketOpen()) {
            socketClient.send(message);
            response.onResponse();
        } else {
            response.onError(null);
        }
    }

    public boolean IsWebSocketOpen() {
        if (socketClient != null) {
            return socketClient.IsWebSocketOpen();
        }

        return false;
    }

    public boolean IsWebSocketOpenOrConnecting() {
        if (socketClient != null) {
            return socketClient.IsWebSocketOpenOrConnecting();
        }

        return false;
    }

    public void StartReceivingSessionUpdates(int intervalMs) {
        SendWebSocketMessage("SessionsStart", intervalMs + "," + intervalMs, new EmptyResponse());
    }

    public void StopReceivingSessionUpdates() {
        SendWebSocketMessage("SessionsStop", "", new EmptyResponse());
    }

    public void onMessage(String message) {
        String messageType = GetMessageType(message);

        logger.Info("Received web socket message: %s", messageType);

        if ("LibraryChanged".equalsIgnoreCase(messageType)) {
            LibraryUpdateInfo obj = jsonSerializer.DeserializeFromString(message, LibraryUpdateInfo.class);
            apiEventListener.onLibraryChanged(apiClient, obj);
        } else if ("RestartRequired".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("ServerRestarting".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("ServerShuttingDown".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("UserDeleted".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("ScheduledTaskEnded".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("PackageInstalling".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("PackageInstallationFailed".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("PackageInstallationCompleted".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("PackageInstallationCancelled".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("UserUpdated".equalsIgnoreCase(messageType)) {
            UserDtoMessage obj = jsonSerializer.DeserializeFromString(message, UserDtoMessage.class);
            apiEventListener.onUserUpdated(apiClient, obj.getData());
        } else if ("UserConfigurationUpdated".equalsIgnoreCase(messageType)) {
            UserDtoMessage obj = jsonSerializer.DeserializeFromString(message, UserDtoMessage.class);
            apiEventListener.onUserConfigurationUpdated(apiClient, obj.getData());
        } else if ("PluginUninstalled".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("Play".equalsIgnoreCase(messageType)) {
            PlayRequestMessage obj = jsonSerializer.DeserializeFromString(message, PlayRequestMessage.class);
            apiEventListener.onPlayCommand(apiClient, obj.getData());
        } else if ("Playstate".equalsIgnoreCase(messageType)) {
            PlaystateRequestMessage obj = jsonSerializer.DeserializeFromString(message, PlaystateRequestMessage.class);
            apiEventListener.onPlaystateCommand(apiClient, obj.getData());
        } else if ("NotificationAdded".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("NotificationUpdated".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("NotificationsMarkedRead".equalsIgnoreCase(messageType)) {
            // TODO: Needs implementation
        } else if ("GeneralCommand".equalsIgnoreCase(messageType)) {
            OnGeneralCommand(message);
        } else if ("Sessions".equalsIgnoreCase(messageType)) {
            SessionUpdatesEventMessage obj = jsonSerializer.DeserializeFromString(message, SessionUpdatesEventMessage.class);
            apiEventListener.onSessionsUpdated(apiClient, obj.getData());
        } else if ("UserDataChanged".equalsIgnoreCase(messageType)) {
            UserDataChangeMessage obj = jsonSerializer.DeserializeFromString(message, UserDataChangeMessage.class);
            apiEventListener.onUserDataChanged(apiClient, obj.getData());
        } else if ("SessionEnded".equalsIgnoreCase(messageType)) {
            SessionInfoMessage obj = jsonSerializer.DeserializeFromString(message, SessionInfoMessage.class);
            apiEventListener.onSessionEnded(apiClient, obj.getData());
        } else if ("PlaybackStart".equalsIgnoreCase(messageType)) {
            SessionInfoMessage obj = jsonSerializer.DeserializeFromString(message, SessionInfoMessage.class);
            apiEventListener.onPlaybackStart(apiClient, obj.getData());
        } else if ("PlaybackStopped".equalsIgnoreCase(messageType)) {
            SessionInfoMessage obj = jsonSerializer.DeserializeFromString(message, SessionInfoMessage.class);
            apiEventListener.onPlaybackStopped(apiClient, obj.getData());
        }
    }

    private void OnGeneralCommand(String json) throws NumberFormatException {
        GeneralCommandEventArgs args = new GeneralCommandEventArgs();

        GeneralCommandMessage obj = jsonSerializer.DeserializeFromString(json, GeneralCommandMessage.class);
        args.setCommand(obj.getData());

        if (!tangible.DotNetToJavaStringHelper.isNullOrEmpty(args.getCommand().getName())) {
            args.setKnownCommandType(GeneralCommandType.valueOf(args.getCommand().getName()));
        }

        if (args.getKnownCommandType() != null) {
            if (args.getKnownCommandType() == GeneralCommandType.DisplayContent) {
                String itemId = args.getCommand().getArguments().get("ItemId");
                String itemName = args.getCommand().getArguments().get("ItemName");
                String itemType = args.getCommand().getArguments().get("ItemType");

                BrowseRequest request = new BrowseRequest();
                request.setItemId(itemId);
                request.setItemName(itemName);
                request.setItemType(itemType);

                apiEventListener.onBrowseCommand(apiClient, request);
                return;
            }
            if (args.getKnownCommandType() == GeneralCommandType.DisplayMessage) {
                String header = args.getCommand().getArguments().get("Header");
                String text = args.getCommand().getArguments().get("Text");
                String timeoutMs = args.getCommand().getArguments().get("TimeoutMs");

                MessageCommand command = new MessageCommand();
                command.setHeader(header);
                command.setText(text);
                command.setTimeoutMs(Long.parseLong(timeoutMs));

                apiEventListener.onMessageCommand(apiClient, command);
                return;
            }
            if (args.getKnownCommandType() == GeneralCommandType.SetVolume) {
                String volume = args.getCommand().getArguments().get("Volume");
                apiEventListener.onSetVolumeCommand(apiClient, Integer.parseInt(volume));
                return;
            }
            if (args.getKnownCommandType() == GeneralCommandType.SetAudioStreamIndex) {
                String index = args.getCommand().getArguments().get("Index");
                apiEventListener.onSetAudioStreamIndexCommand(apiClient, Integer.parseInt(index));
                return;
            }
            if (args.getKnownCommandType() == GeneralCommandType.SetSubtitleStreamIndex) {
                String index = args.getCommand().getArguments().get("Index");
                apiEventListener.onSetSubtitleStreamIndexCommand(apiClient, Integer.parseInt(index));
                return;
            }
            if (args.getKnownCommandType() == GeneralCommandType.SendString) {
                String val = args.getCommand().getArguments().get("String");
                apiEventListener.onSendStringCommand(apiClient, val);
                return;
            }
        }

        apiEventListener.onGeneralCommand(apiClient, args.getCommand());
    }

    private String GetMessageType(String json) {
        BasicWebSocketMessage message = jsonSerializer.DeserializeFromString(json, BasicWebSocketMessage.class);
        return message.getMessageType();
    }
}
