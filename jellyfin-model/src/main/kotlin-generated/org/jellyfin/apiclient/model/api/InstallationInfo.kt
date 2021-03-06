// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class InstallationInfo.
 */
@Serializable
data class InstallationInfo(
	/**
	 * Gets or sets the guid.
	 */
	@SerialName("Guid")
	val guid: UUID,
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	val name: String? = null,
	@SerialName("Version")
	val version: Version? = null,
	/**
	 * Gets or sets the changelog for this version.
	 */
	@SerialName("Changelog")
	val changelog: String? = null,
	/**
	 * Gets or sets the source URL.
	 */
	@SerialName("SourceUrl")
	val sourceUrl: String? = null,
	/**
	 * Gets or sets a checksum for the binary.
	 */
	@SerialName("Checksum")
	val checksum: String? = null
)
