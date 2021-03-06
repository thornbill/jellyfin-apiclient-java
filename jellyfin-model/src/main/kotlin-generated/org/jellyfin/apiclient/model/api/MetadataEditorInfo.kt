// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetadataEditorInfo(
	@SerialName("ParentalRatingOptions")
	val parentalRatingOptions: List<ParentalRating>? = null,
	@SerialName("Countries")
	val countries: List<CountryInfo>? = null,
	@SerialName("Cultures")
	val cultures: List<CultureDto>? = null,
	@SerialName("ExternalIdInfos")
	val externalIdInfos: List<ExternalIdInfo>? = null,
	@SerialName("ContentType")
	val contentType: String? = null,
	@SerialName("ContentTypeOptions")
	val contentTypeOptions: List<NameValuePair>? = null
)
