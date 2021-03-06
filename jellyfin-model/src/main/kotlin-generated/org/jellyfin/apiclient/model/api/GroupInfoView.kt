// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class GroupInfoView.
 */
@Serializable
data class GroupInfoView(
	/**
	 * Gets or sets the group identifier.
	 */
	@SerialName("GroupId")
	val groupId: String? = null,
	/**
	 * Gets or sets the playing item id.
	 */
	@SerialName("PlayingItemId")
	val playingItemId: String? = null,
	/**
	 * Gets or sets the playing item name.
	 */
	@SerialName("PlayingItemName")
	val playingItemName: String? = null,
	/**
	 * Gets or sets the position ticks.
	 */
	@SerialName("PositionTicks")
	val positionTicks: Long,
	/**
	 * Gets or sets the participants.
	 */
	@SerialName("Participants")
	val participants: List<String>? = null
)
