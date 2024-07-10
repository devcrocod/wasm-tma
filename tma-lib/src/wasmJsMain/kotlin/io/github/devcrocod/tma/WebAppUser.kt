package io.github.devcrocod.tma

@JsModule("telegram-web-apps.js")
/**
 * This object contains the data of the Mini App user.
 *
 * @property id A unique identifier for the user or bot. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
 * It has at most 52 significant bits, so a 64-bit integer or a double-precision float type is safe for storing this identifier.
 * @property is_bot _Optional_. True, if this user is a bot. Returns in the receiver field only.
 * @property first_name First name of the user or bot.
 * @property last_name _Optional_. Last name of the user or bot.
 * @property username _Optional_. Username of the user or bot.
 * @property language_code _Optional_. [IETF language tag](https://en.wikipedia.org/wiki/IETF_language_tag) of the user's language. Returns in user field only.
 * @property is_premium _Optional_. True, if this user is a Telegram Premium user.
 * @property added_to_attachment_menu _Optional_. True, if this user added the bot to the attachment menu.
 * @property allows_write_to_pm _Optional_. True, if this user allowed the bot to message them.
 * @property photo_url _Optional_. URL of the user’s profile photo. The photo can be in .jpeg or .svg formats. Only returned for Mini Apps launched from the attachment menu.
 */
external class WebAppUser(
    id: Int,
    is_bot: Boolean?,
    first_name: String,
    last_name: String?,
    username: String?,
    language_code: String?,
    is_premium: Boolean?,
    added_to_attachment_menu: Boolean?,
    allows_write_to_pm: Boolean?,
    photo_url: String?
) : JsAny {
    val id: Int
    val is_bot: Boolean?
    val first_name: String
    val last_name: String?
    val username: String?
    val language_code: String?
    val is_premium: Boolean?
    val added_to_attachment_menu: Boolean?
    val allows_write_to_pm: Boolean?
    val photo_url: String?
}