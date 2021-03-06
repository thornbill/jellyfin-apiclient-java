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

/**
 * Class CultureDto.
 */
@Serializable
data class CultureDto(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the display name.
	 */
	@SerialName("DisplayName")
	val displayName: String? = null,
	/**
	 * Gets or sets the name of the two letter ISO language.
	 */
	@SerialName("TwoLetterISOLanguageName")
	val twoLetterIsoLanguageName: String? = null,
	/**
	 * Gets or sets the name of the three letter ISO language.
	 */
	@SerialName("ThreeLetterISOLanguageName")
	val threeLetterIsoLanguageName: String? = null,
	@SerialName("ThreeLetterISOLanguageNames")
	val threeLetterIsoLanguageNames: List<String>? = null
)
