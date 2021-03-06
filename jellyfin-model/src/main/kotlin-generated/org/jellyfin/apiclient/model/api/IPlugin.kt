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

/**
 * Interface IPlugin.
 */
@Serializable
data class IPlugin(
	/**
	 * Gets the name of the plugin.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets the description.
	 */
	@SerialName("Description")
	val description: String? = null,
	/**
	 * Gets the unique id.
	 */
	@SerialName("Id")
	val id: UUID,
	@SerialName("Version")
	val version: Version? = null,
	/**
	 * Gets the path to the assembly file.
	 */
	@SerialName("AssemblyFilePath")
	val assemblyFilePath: String? = null,
	/**
	 * Gets a value indicating whether the plugin can be uninstalled.
	 */
	@SerialName("CanUninstall")
	val canUninstall: Boolean,
	/**
	 * Gets the full path to the data folder, where the plugin can store any miscellaneous files
	 * needed.
	 */
	@SerialName("DataFolderPath")
	val dataFolderPath: String? = null
)
