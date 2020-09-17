// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.String

/**
 * The configuration page info.
 */
data class ConfigurationPageInfo(
	/**
	 * Gets or sets the name.
	 */
	val name: String? = null,
	/**
	 * Gets or sets a value indicating whether the configurations page is enabled in the main menu.
	 */
	val enableInMainMenu: Boolean,
	/**
	 * Gets or sets the menu section.
	 */
	val menuSection: String? = null,
	/**
	 * Gets or sets the menu icon.
	 */
	val menuIcon: String? = null,
	/**
	 * Gets or sets the display name.
	 */
	val displayName: String? = null,
	val configurationPageType: ConfigurationPageType,
	/**
	 * Gets or sets the plugin id.
	 */
	val pluginId: String? = null
)