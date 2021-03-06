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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.LocalDateTimeSerializer
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

@Serializable
data class TimerInfoDto(
	/**
	 * Id of the recording.
	 */
	@SerialName("Id")
	val id: String? = null,
	@SerialName("Type")
	val type: String? = null,
	/**
	 * Gets or sets the server identifier.
	 */
	@SerialName("ServerId")
	val serverId: String? = null,
	/**
	 * Gets or sets the external identifier.
	 */
	@SerialName("ExternalId")
	val externalId: String? = null,
	/**
	 * ChannelId of the recording.
	 */
	@SerialName("ChannelId")
	val channelId: UUID,
	/**
	 * Gets or sets the external channel identifier.
	 */
	@SerialName("ExternalChannelId")
	val externalChannelId: String? = null,
	/**
	 * ChannelName of the recording.
	 */
	@SerialName("ChannelName")
	val channelName: String? = null,
	@SerialName("ChannelPrimaryImageTag")
	val channelPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the program identifier.
	 */
	@SerialName("ProgramId")
	val programId: String? = null,
	/**
	 * Gets or sets the external program identifier.
	 */
	@SerialName("ExternalProgramId")
	val externalProgramId: String? = null,
	/**
	 * Name of the recording.
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Description of the recording.
	 */
	@SerialName("Overview")
	val overview: String? = null,
	/**
	 * The start date of the recording, in UTC.
	 */
	@SerialName("StartDate")
	val startDate: LocalDateTime,
	/**
	 * The end date of the recording, in UTC.
	 */
	@SerialName("EndDate")
	val endDate: LocalDateTime,
	/**
	 * Gets or sets the name of the service.
	 */
	@SerialName("ServiceName")
	val serviceName: String? = null,
	/**
	 * Gets or sets the priority.
	 */
	@SerialName("Priority")
	val priority: Int,
	/**
	 * Gets or sets the pre padding seconds.
	 */
	@SerialName("PrePaddingSeconds")
	val prePaddingSeconds: Int,
	/**
	 * Gets or sets the post padding seconds.
	 */
	@SerialName("PostPaddingSeconds")
	val postPaddingSeconds: Int,
	/**
	 * Gets or sets a value indicating whether this instance is pre padding required.
	 */
	@SerialName("IsPrePaddingRequired")
	val isPrePaddingRequired: Boolean,
	/**
	 * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	 */
	@SerialName("ParentBackdropItemId")
	val parentBackdropItemId: String? = null,
	/**
	 * Gets or sets the parent backdrop image tags.
	 */
	@SerialName("ParentBackdropImageTags")
	val parentBackdropImageTags: List<String>? = null,
	/**
	 * Gets or sets a value indicating whether this instance is post padding required.
	 */
	@SerialName("IsPostPaddingRequired")
	val isPostPaddingRequired: Boolean,
	@SerialName("KeepUntil")
	val keepUntil: KeepUntil? = null,
	@SerialName("Status")
	val status: RecordingStatus? = null,
	/**
	 * Gets or sets the series timer identifier.
	 */
	@SerialName("SeriesTimerId")
	val seriesTimerId: String? = null,
	/**
	 * Gets or sets the external series timer identifier.
	 */
	@SerialName("ExternalSeriesTimerId")
	val externalSeriesTimerId: String? = null,
	/**
	 * Gets or sets the run time ticks.
	 */
	@SerialName("RunTimeTicks")
	val runTimeTicks: Long? = null,
	@SerialName("ProgramInfo")
	val programInfo: BaseItemDto? = null
)
