// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import java.time.LocalDateTime
import kotlin.Boolean

/**
 * MB Registration Record.
 */
data class MbRegistrationRecord(
	/**
	 * Gets or sets expiration date.
	 */
	val expirationDate: LocalDateTime,
	/**
	 * Gets or sets a value indicating whether is registered.
	 */
	val isRegistered: Boolean,
	/**
	 * Gets or sets a value indicating whether reg checked.
	 */
	val regChecked: Boolean,
	/**
	 * Gets or sets a value indicating whether reg error.
	 */
	val regError: Boolean,
	/**
	 * Gets or sets a value indicating whether trial version.
	 */
	val trialVersion: Boolean,
	/**
	 * Gets or sets a value indicating whether is valid.
	 */
	val isValid: Boolean
)