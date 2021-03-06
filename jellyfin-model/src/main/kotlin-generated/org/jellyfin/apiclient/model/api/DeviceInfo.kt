// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	LocalDateTimeSerializer::class
)

package org.jellyfin.apiclient.model.api

import java.time.LocalDateTime
import java.util.UUID
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.LocalDateTimeSerializer
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

@Serializable
data class DeviceInfo(
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the identifier.
	 */
	@SerialName("Id")
	val id: String? = null,
	/**
	 * Gets or sets the last name of the user.
	 */
	@SerialName("LastUserName")
	val lastUserName: String? = null,
	/**
	 * Gets or sets the name of the application.
	 */
	@SerialName("AppName")
	val appName: String? = null,
	/**
	 * Gets or sets the application version.
	 */
	@SerialName("AppVersion")
	val appVersion: String? = null,
	/**
	 * Gets or sets the last user identifier.
	 */
	@SerialName("LastUserId")
	val lastUserId: UUID,
	/**
	 * Gets or sets the date last modified.
	 */
	@SerialName("DateLastActivity")
	val dateLastActivity: LocalDateTime,
	@SerialName("Capabilities")
	val capabilities: ClientCapabilities? = null,
	@SerialName("IconUrl")
	val iconUrl: String? = null
)
