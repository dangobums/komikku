package eu.kanade.tachiyomi.data.track.shikimori.dto

import kotlinx.serialization.Serializable

@Serializable
data class SMUser(
    val id: Int,
    // Mihon -->
    val nickname: String,
    // Mihon <--
)
