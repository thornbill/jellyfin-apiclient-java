// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.String
import kotlin.collections.Map
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This is used by the api to get information about a Person within a BaseItem.
 */
@Serializable
data class BaseItemPerson(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the identifier.
	 */
	@SerialName("Id")
	val id: String? = null,
	/**
	 * Gets or sets the role.
	 */
	@SerialName("Role")
	val role: String? = null,
	/**
	 * Gets or sets the type.
	 */
	@SerialName("Type")
	val type: String? = null,
	/**
	 * Gets or sets the primary image tag.
	 */
	@SerialName("PrimaryImageTag")
	val primaryImageTag: String? = null,
	/**
	 * Gets or sets the primary image blurhash.
	 */
	@SerialName("ImageBlurHashes")
	val imageBlurHashes: Map<ImageType, Map<String, String>>
)
