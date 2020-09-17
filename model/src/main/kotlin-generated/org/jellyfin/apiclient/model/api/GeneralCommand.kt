// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.String
import kotlin.collections.Map

data class GeneralCommand(
	val name: String? = null,
	val controllingUserId: UUID,
	val arguments: Map<String, String>? = null
)