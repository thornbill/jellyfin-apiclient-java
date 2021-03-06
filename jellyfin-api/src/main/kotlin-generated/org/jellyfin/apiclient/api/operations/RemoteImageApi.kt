// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import io.ktor.utils.io.ByteReadChannel
import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.ImageProviderInfo
import org.jellyfin.apiclient.model.api.ImageType
import org.jellyfin.apiclient.model.api.RemoteImageResult

class RemoteImageApi(
	private val api: KtorClient
) {
	/**
	 * Gets a remote image.
	 *
	 * @param imageUrl The image url.
	 */
	suspend fun getRemoteImage(imageUrl: String): Response<ByteReadChannel> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["imageUrl"] = imageUrl
		val data = null
		val response = api.get<ByteReadChannel>("/Images/Remote", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a remote image.
	 *
	 * @param imageUrl The image url.
	 */
	fun getRemoteImageUrl(imageUrl: String): String {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["imageUrl"] = imageUrl
		return api.createUrl("/Images/Remote", pathParameters, queryParameters)
	}

	/**
	 * Gets available remote images for an item.
	 *
	 * @param itemId Item Id.
	 * @param type The image type.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param providerName Optional. The image provider to use.
	 * @param includeAllLanguages Optional. Include all languages.
	 */
	suspend fun getRemoteImages(
		itemId: UUID,
		type: ImageType,
		startIndex: Int? = null,
		limit: Int? = null,
		providerName: String? = null,
		includeAllLanguages: Boolean = false
	): Response<RemoteImageResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["type"] = type
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["providerName"] = providerName
		queryParameters["includeAllLanguages"] = includeAllLanguages
		val data = null
		val response = api.get<RemoteImageResult>("/Items/{itemId}/RemoteImages", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Downloads a remote image for an item.
	 *
	 * @param itemId Item Id.
	 * @param type The image type.
	 * @param imageUrl The image url.
	 */
	suspend fun downloadRemoteImage(
		itemId: UUID,
		type: ImageType,
		imageUrl: String? = null
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["type"] = type
		queryParameters["imageUrl"] = imageUrl
		val data = null
		val response = api.post<Unit>("/Items/{itemId}/RemoteImages/Download", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets available remote image providers for an item.
	 *
	 * @param itemId Item Id.
	 */
	suspend fun getRemoteImageProviders(itemId: UUID): Response<List<ImageProviderInfo>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<ImageProviderInfo>>("/Items/{itemId}/RemoteImages/Providers",
				pathParameters, queryParameters, data)
		return response
	}
}
