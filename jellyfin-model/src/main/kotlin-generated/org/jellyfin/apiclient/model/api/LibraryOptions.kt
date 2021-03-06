// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LibraryOptions(
	@SerialName("EnablePhotos")
	val enablePhotos: Boolean,
	@SerialName("EnableRealtimeMonitor")
	val enableRealtimeMonitor: Boolean,
	@SerialName("EnableChapterImageExtraction")
	val enableChapterImageExtraction: Boolean,
	@SerialName("ExtractChapterImagesDuringLibraryScan")
	val extractChapterImagesDuringLibraryScan: Boolean,
	@SerialName("DownloadImagesInAdvance")
	val downloadImagesInAdvance: Boolean,
	@SerialName("PathInfos")
	val pathInfos: List<MediaPathInfo>? = null,
	@SerialName("SaveLocalMetadata")
	val saveLocalMetadata: Boolean,
	@SerialName("EnableInternetProviders")
	val enableInternetProviders: Boolean,
	@SerialName("EnableAutomaticSeriesGrouping")
	val enableAutomaticSeriesGrouping: Boolean,
	@SerialName("EnableEmbeddedTitles")
	val enableEmbeddedTitles: Boolean,
	@SerialName("EnableEmbeddedEpisodeInfos")
	val enableEmbeddedEpisodeInfos: Boolean,
	@SerialName("AutomaticRefreshIntervalDays")
	val automaticRefreshIntervalDays: Int,
	/**
	 * Gets or sets the preferred metadata language.
	 */
	@SerialName("PreferredMetadataLanguage")
	val preferredMetadataLanguage: String? = null,
	/**
	 * Gets or sets the metadata country code.
	 */
	@SerialName("MetadataCountryCode")
	val metadataCountryCode: String? = null,
	@SerialName("SeasonZeroDisplayName")
	val seasonZeroDisplayName: String? = null,
	@SerialName("MetadataSavers")
	val metadataSavers: List<String>? = null,
	@SerialName("DisabledLocalMetadataReaders")
	val disabledLocalMetadataReaders: List<String>? = null,
	@SerialName("LocalMetadataReaderOrder")
	val localMetadataReaderOrder: List<String>? = null,
	@SerialName("DisabledSubtitleFetchers")
	val disabledSubtitleFetchers: List<String>? = null,
	@SerialName("SubtitleFetcherOrder")
	val subtitleFetcherOrder: List<String>? = null,
	@SerialName("SkipSubtitlesIfEmbeddedSubtitlesPresent")
	val skipSubtitlesIfEmbeddedSubtitlesPresent: Boolean,
	@SerialName("SkipSubtitlesIfAudioTrackMatches")
	val skipSubtitlesIfAudioTrackMatches: Boolean,
	@SerialName("SubtitleDownloadLanguages")
	val subtitleDownloadLanguages: List<String>? = null,
	@SerialName("RequirePerfectSubtitleMatch")
	val requirePerfectSubtitleMatch: Boolean,
	@SerialName("SaveSubtitlesWithMedia")
	val saveSubtitlesWithMedia: Boolean,
	@SerialName("TypeOptions")
	val typeOptions: List<TypeOptions>? = null
)
