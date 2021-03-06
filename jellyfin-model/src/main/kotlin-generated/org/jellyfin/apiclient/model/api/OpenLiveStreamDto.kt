// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Open live stream dto.
 */
@Serializable
data class OpenLiveStreamDto(
	@SerialName("DeviceProfile")
	val deviceProfile: DeviceProfile? = null,
	/**
	 * Gets or sets the device play protocols.
	 */
	@SerialName("DirectPlayProtocols")
	val directPlayProtocols: List<MediaProtocol>? = null
)
