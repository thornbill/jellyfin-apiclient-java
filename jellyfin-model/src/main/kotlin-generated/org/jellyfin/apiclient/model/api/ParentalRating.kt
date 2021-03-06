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

/**
 * Class ParentalRating.
 */
@Serializable
data class ParentalRating(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the value.
	 */
	@SerialName("Value")
	val value: Int
)
