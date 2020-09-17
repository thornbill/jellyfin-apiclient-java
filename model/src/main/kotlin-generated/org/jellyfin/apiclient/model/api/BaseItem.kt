// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

/**
 * Class BaseItem.
 */
data class BaseItem(
	val size: Long? = null,
	val container: String? = null,
	val dateLastSaved: LocalDateTime,
	/**
	 * Gets or sets the remote trailers.
	 */
	val remoteTrailers: List<MediaUrl>? = null,
	val isHd: Boolean,
	val isShortcut: Boolean,
	val shortcutPath: String? = null,
	val width: Int,
	val height: Int,
	val extraIds: List<UUID>? = null,
	val supportsExternalTransfer: Boolean
)