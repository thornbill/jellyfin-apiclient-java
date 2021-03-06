// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import io.ktor.utils.io.ByteReadChannel
import kotlin.Any
import kotlin.String
import kotlin.Unit
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.MediaEncoderPathDto
import org.jellyfin.apiclient.model.api.MetadataOptions
import org.jellyfin.apiclient.model.api.ServerConfiguration

class ConfigurationApi(
	private val api: KtorClient
) {
	/**
	 * Gets application configuration.
	 */
	suspend fun getConfiguration(): Response<ServerConfiguration> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<ServerConfiguration>("/System/Configuration", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Updates application configuration.
	 */
	suspend fun updateConfiguration(data: ServerConfiguration): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/System/Configuration", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a named configuration.
	 *
	 * @param key Configuration key.
	 */
	suspend fun getNamedConfiguration(key: String): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["key"] = key
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<ByteReadChannel>("/System/Configuration/{key}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a named configuration.
	 *
	 * @param key Configuration key.
	 */
	fun getNamedConfigurationUrl(key: String): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["key"] = key
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/System/Configuration/{key}", pathParameters, queryParameters)
	}

	/**
	 * Updates named configuration.
	 *
	 * @param key Configuration key.
	 */
	suspend fun updateNamedConfiguration(key: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["key"] = key
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/System/Configuration/{key}", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets a default MetadataOptions object.
	 */
	suspend fun getDefaultMetadataOptions(): Response<MetadataOptions> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<MetadataOptions>("/System/Configuration/MetadataOptions/Default",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Updates the path to the media encoder.
	 */
	suspend fun updateMediaEncoderPath(data: MediaEncoderPathDto): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/System/MediaEncoder/Path", pathParameters, queryParameters, data)
		return response
	}
}
