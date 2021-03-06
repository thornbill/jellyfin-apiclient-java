// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProblemDetails(
	@SerialName("type")
	val type: String? = null,
	@SerialName("title")
	val title: String? = null,
	@SerialName("status")
	val status: Int? = null,
	@SerialName("detail")
	val detail: String? = null,
	@SerialName("instance")
	val instance: String? = null
)
