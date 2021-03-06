// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

@Serializable
data class BoxSetInfoRemoteSearchQuery(
	@SerialName("SearchInfo")
	val searchInfo: BoxSetInfo? = null,
	@SerialName("ItemId")
	val itemId: UUID,
	/**
	 * Will only search within the given provider when set.
	 */
	@SerialName("SearchProviderName")
	val searchProviderName: String? = null,
	/**
	 * Gets or sets a value indicating whether disabled providers should be included.
	 */
	@SerialName("IncludeDisabledProviders")
	val includeDisabledProviders: Boolean
)
