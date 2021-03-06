// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Double
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used to hold information about a user's list of configured virtual folders.
 */
@Serializable
data class VirtualFolderInfo(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the locations.
	 */
	@SerialName("Locations")
	val locations: List<String>? = null,
	/**
	 * Gets or sets the type of the collection.
	 */
	@SerialName("CollectionType")
	val collectionType: String? = null,
	@SerialName("LibraryOptions")
	val libraryOptions: LibraryOptions? = null,
	/**
	 * Gets or sets the item identifier.
	 */
	@SerialName("ItemId")
	val itemId: String? = null,
	/**
	 * Gets or sets the primary image item identifier.
	 */
	@SerialName("PrimaryImageItemId")
	val primaryImageItemId: String? = null,
	@SerialName("RefreshProgress")
	val refreshProgress: Double? = null,
	@SerialName("RefreshStatus")
	val refreshStatus: String? = null
)
