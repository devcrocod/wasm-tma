package io.github.devcrocod.tma

@JsModule("telegram-web-apps.js")
/**
 * This object contains data that is transferred to the Mini App when it is opened.
 * It is empty if the Mini App was launched from a [keyboard button](https://core.telegram.org/bots/webapps#keyboard-button-mini-apps)
 * or from [inline mode](https://core.telegram.org/bots/webapps#inline-mode-mini-apps).
 *
 * @property query_id _Optional_. A unique identifier for the Mini App session, required for sending messages via the [answerWebAppQuery](https://core.telegram.org/bots/api#answerwebappquery) method.
 * @property user _Optional_. An object containing data about the current user.
 * @property receiver _Optional_. An object containing data about the chat partner of the current user in the chat where the bot was launched via the attachment menu.
 * Returned only for private chats and only for Mini Apps launched via the attachment menu.
 * @property chat _Optional_. An object containing data about the chat where the bot was launched via the attachment menu.
 * Returned for supergroups, channels and group chats – only for Mini Apps launched via the attachment menu.
 * @property chat_type _Optional_. Type of the chat from which the Mini App was opened.
 * Can be either “sender” for a private chat with the user opening the link, “private”, “group”, “supergroup”, or “channel”.
 * Returned only for Mini Apps launched from direct links.
 * @property chat_instance Optional. Global identifier, uniquely corresponding to the chat from which the Mini App was opened.
 * Returned only for Mini Apps launched from a direct link.
 * @property start_param _Optional_. The value of the startattach parameter, passed [via link](https://core.telegram.org/bots/webapps#adding-bots-to-the-attachment-menu).
 * Only returned for Mini Apps when launched from the attachment menu via link.
 *
 * The value of the `start_param` parameter will also be passed in the GET-parameter `tgWebAppStartParam`, so the Mini App can load the correct interface right away.
 * @property can_send_after _Optional_. Time in seconds, after which a message can be sent via the [answerWebAppQuery](https://core.telegram.org/bots/api#answerwebappquery) method.
 * @property auth_date Unix time when the form was opened.
 * @property hash A hash of all passed parameters, which the bot server can use to [check their validity](https://core.telegram.org/bots/webapps#validating-data-received-via-the-mini-app).
 */
external class WebAppInitData(
    query_id: String?,
    user: WebAppUser?,
    receiver: WebAppUser?,
    chat: WebAppChat?,
    chat_type: String?,
    chat_instance: String?,
    start_param: String?,
    can_send_after: Int?,
    auth_date: Int,
    hash: String,
) : JsAny {
    val query_id: String?
    val user: WebAppUser?
    val receiver: WebAppUser?
    val chat: WebAppChat?
    val chat_type: String?
    val chat_instance: String?
    val start_param: String?
    val can_send_after: Int?
    val auth_date: Int
    val hash: String
}