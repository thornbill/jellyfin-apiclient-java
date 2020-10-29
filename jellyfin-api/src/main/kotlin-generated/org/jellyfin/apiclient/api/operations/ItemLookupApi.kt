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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.AlbumInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.ArtistInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.BookInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.BoxSetInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.ExternalIdInfo
import org.jellyfin.apiclient.model.api.MovieInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.MusicVideoInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.PersonLookupInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.RemoteSearchResult
import org.jellyfin.apiclient.model.api.SeriesInfoRemoteSearchQuery
import org.jellyfin.apiclient.model.api.TrailerInfoRemoteSearchQuery

class ItemLookupApi(
	private val api: KtorClient
) {
	/**
	 * Get the item's external id info.
	 *
	 * @param itemId Item id.
	 */
	suspend fun getExternalIdInfos(itemId: UUID): Response<List<ExternalIdInfo>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<ExternalIdInfo>>("/Items/{itemId}/ExternalIdInfos", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Applies search criteria to an item and refreshes metadata.
	 *
	 * @param itemId Item id.
	 * @param replaceAllImages Optional. Whether or not to replace all images. Default: True.
	 */
	suspend fun applySearchCriteria(
		itemId: UUID,
		replaceAllImages: Boolean = true,
		data: RemoteSearchResult
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["replaceAllImages"] = replaceAllImages
		val response = api.post<Unit>("/Items/RemoteSearch/Apply/{itemId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get book remote search.
	 */
	suspend fun getBookRemoteSearchResults(data: BookInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/Book", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get box set remote search.
	 */
	suspend fun getBoxSetRemoteSearchResults(data: BoxSetInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/BoxSet", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a remote image.
	 *
	 * @param imageUrl The image url.
	 * @param providerName The provider name.
	 */
	suspend fun getRemoteSearchImage(imageUrl: String, providerName: String):
			Response<ByteReadChannel> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["imageUrl"] = imageUrl
		queryParameters["providerName"] = providerName
		val data = null
		val response = api.get<ByteReadChannel>("/Items/RemoteSearch/Image", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a remote image.
	 *
	 * @param imageUrl The image url.
	 * @param providerName The provider name.
	 */
	fun getRemoteSearchImageUrl(imageUrl: String, providerName: String): String {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["imageUrl"] = imageUrl
		queryParameters["providerName"] = providerName
		return api.createUrl("/Items/RemoteSearch/Image", pathParameters, queryParameters)
	}

	/**
	 * Get movie remote search.
	 */
	suspend fun getMovieRemoteSearchResults(data: MovieInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/Movie", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get music album remote search.
	 */
	suspend fun getMusicAlbumRemoteSearchResults(data: AlbumInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/MusicAlbum",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Get music artist remote search.
	 */
	suspend fun getMusicArtistRemoteSearchResults(data: ArtistInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/MusicArtist",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Get music video remote search.
	 */
	suspend fun getMusicVideoRemoteSearchResults(data: MusicVideoInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/MusicVideo",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Get person remote search.
	 */
	suspend fun getPersonRemoteSearchResults(data: PersonLookupInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/Person", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get series remote search.
	 */
	suspend fun getSeriesRemoteSearchResults(data: SeriesInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/Series", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get trailer remote search.
	 */
	suspend fun getTrailerRemoteSearchResults(data: TrailerInfoRemoteSearchQuery):
			Response<List<RemoteSearchResult>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<List<RemoteSearchResult>>("/Items/RemoteSearch/Trailer", pathParameters,
				queryParameters, data)
		return response
	}
}