package io.github.devcrocod.tma

@JsModule("telegram-web-apps.js")
/**
 * This object represents a chat.
 *
 * @property id Unique identifier for this chat. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
 * @property type Type of chat, can be either “group”, “supergroup” or “channel”
 * @property title Title of the chat
 * @property username _Optional_. Username of the chat
 * @property photo_url _Optional_. URL of the chat’s photo. The photo can be in .jpeg or .svg formats. Only returned for Mini Apps launched from the attachment menu.
 */
external class WebAppChat(
    id: Int,
    type: String,
    title: String,
    username: String?,
    photo_url: String?
) : JsAny {
    val id: Int
    val type: String
    val title: String
    val username: String?
    val photo_url: String?
}