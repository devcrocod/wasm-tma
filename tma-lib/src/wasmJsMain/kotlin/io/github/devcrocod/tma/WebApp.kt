package io.github.devcrocod.tma

@JsModule("https://telegram.org/js/telegram-web-app.js")
external object WebApp {
    /**
     * A string with raw data transferred to the Mini App,
     * convenient for [validating data](https://core.telegram.org/bots/webapps#validating-data-received-via-the-mini-app).
     * **WARNING**: [Validate data](https://core.telegram.org/bots/webapps#validating-data-received-via-the-mini-app) from this field before using it on the bot's server.
     */
    val initData: String

    /**
     * An object with input data transferred to the Mini App.
     * **WARNING**: Data from this field should not be trusted.
     * You should only use data from initData on the bot's server and only after it has been [validated](https://core.telegram.org/bots/webapps#validating-data-received-via-the-mini-app).
     */
    val initDataUnsafe: WebAppInitData

    /**
     * The version of the Bot API available in the user's Telegram app.
     */
    val version: String

    /**
     * The name of the platform of the user's Telegram app.
     */
    val platform: String

    /**
     * The color scheme currently used in the Telegram app. Either “light” or “dark”.
     * Also available as the CSS variable `var(--tg-color-scheme`).
     */
    val colorScheme: String

    /**
     * An object containing the current theme settings used in the Telegram app.
     */
    val themeParams: ThemeParams

    /**
     * True, if the Mini App is expanded to the maximum available height.
     * False, if the Mini App occupies part of the screen and can be expanded to the full height using the **expand()** method.
     */
    val isExpanded: Boolean

    /**
     * The current height of the visible area of the Mini App. Also available in CSS as the variable `var(--tg-viewport-height)`.
     *
     * The application can display just the top part of the Mini App, with its lower part remaining outside the screen area.
     * From this position, the user can “pull” the Mini App to its maximum height,
     * while the bot can do the same by calling the expand() method.
     * As the position of the Mini App changes, the current height value of the visible area will be updated in real time.
     *
     * Please note that the refresh rate of this value is not sufficient to smoothly follow the lower border of the window.
     * It should not be used to pin interface elements to the bottom of the visible area.
     * It's more appropriate to use the value of the `viewportStableHeight` field for this purpose.
     */
    val viewportHeight: Float

    /**
     * The height of the visible area of the Mini App in its last stable state. Also available in CSS as a variable `var(--tg-viewport-stable-height)`.

     * The application can display just the top part of the Mini App, with its lower part remaining outside the screen area.
     * From this position, the user can “pull” the Mini App to its maximum height, while the bot can do the same by calling the expand() method.
     * Unlike the value of `viewportHeight`,
     * the value of `viewportStableHeight` does not change as the position of the Mini App changes with user gestures or during animations.
     * The value of `viewportStableHeight` will be updated after all gestures and animations are completed and the Mini App reaches its final size.

     * _Note the [event](https://core.telegram.org/bots/webapps#events-available-for-mini-apps) `viewportChanged` with the passed parameter `isStateStable=true`,_
     * _which will allow you to track when the stable state of the height of the visible area changes._
     */
    val viewportStableHeight: Float

    /**
     * Current header color in the `#RRGGBB` format.
     */
    val headerColor: String

    /**
     * Current background color in the `#RRGGBB` format.
     */
    val backgroundColor: String

    /**
     * True, if the confirmation dialog is enabled while the user is trying to close the Mini App. False, if the confirmation dialog is disabled.
     */
    val isClosingConfirmationEnabled: Boolean

    /**
     * True, if vertical swipes to close or minimize the Mini App are enabled. False, if vertical swipes to close or minimize the Mini App are disabled.
     * In any case, the user will still be able to minimize and close the Mini App by swiping the Mini App's header.
     */
    val isVerticalSwipesEnabled: Boolean

    /**
     * An object for controlling the back button which can be displayed in the header of the Mini App in the Telegram interface.
     */
    val BackButton: BackButton

    /**
     * An object for controlling the main button, which is displayed at the bottom of the Mini App in the Telegram interface.
     */
    val MainButton: MainButton

    /**
     * An object for controlling the Settings item in the context menu of the Mini App in the Telegram interface.
     */
    val SettingsButton: SettingsButton

    /**
     * An object for controlling haptic feedback.
     */
    val HapticFeedback: HapticFeedback

    /**
     * An object for controlling cloud storage.
     */
    val CloudStorage: CloudStorage

    /**
     * An object for controlling biometrics on the device.
     */
    val BiometricManager: BiometricManager

    /**
     * Returns true if the user's app supports a version of the Bot API that is equal to or higher than the version passed as the parameter.
     */
    fun isVersionAtLeast(version: String): Boolean

    /**
     * A method that sets the app header color in the `#RRGGBB` format. You can also use keywords bg_color and secondary_bg_color.
     *
     * Up to `Bot API 6.9` You can only pass Telegram.WebApp.themeParams.bg_color or Telegram.WebApp.themeParams.secondary_bg_color as a color or bg_color, secondary_bg_color keywords.
     *
     * @since Bot API 6.1+
     */
    fun setHeaderColor(color: String)

    /**
     * A method that sets the app background color in the `#RRGGBB` format. You can also use keywords bg_color and secondary_bg_color.
     *
     * @since Bot API 6.1+
     */
    fun setBackgroundColor(color: String)

    /**
     * A method that enables a confirmation dialog while the user is trying to close the Mini App.
     *
     * @since Bot API 6.2+
     */
    fun enableClosingConfirmation()

    /**
     * A method that disables the confirmation dialog while the user is trying to close the Mini App.
     *
     * @since Bot API 6.2+
     */
    fun disableClosingConfirmation()

    /**
     * A method that enables vertical swipes to close or minimize the Mini App.
     * For user convenience, it is recommended to always enable swipes unless they conflict with the Mini App's own gestures.
     *
     * @since Bot API 7.7+
     */
    fun enableVerticalSwipes()

    /**
     * A method that disables vertical swipes to close or minimize the Mini App.
     * This method is useful if your Mini App uses swipe gestures that may conflict with the gestures for minimizing and closing the app.
     *
     * @since Bot API 7.7+
     */
    fun disableVerticalSwipes()

    /**
     * A method that sets the app event handler. Check the list of available [events](https://core.telegram.org/bots/webapps#events-available-for-mini-apps).
     */
    fun onEvent(eventType: String, eventHandler: (JsAny?) -> Unit)

    /**
     * A method that deletes a previously set event handler.
     */
    fun offEvent(eventType: String, eventHandler: (JsAny?) -> Unit)

    /**
     * A method used to send data to the bot.
     * When this method is called, a service message is sent to the bot containing the data data of the length up to 4096 bytes,
     * and the Mini App is closed. See the field web_app_data in the class [Message](https://core.telegram.org/bots/api#message).
     *
     * This method is only available for Mini Apps launched via a [Keyboard button](https://core.telegram.org/bots/webapps#keyboard-button-mini-apps).
     */
    fun sendData(data: String)

    /**
     * A method that inserts the bot's username and the specified inline query in the current chat's input field.
     * Query may be empty, in which case only the bot's username will be inserted.
     * If an optional choose_chat_types parameter was passed,the client prompts the user to choose a specific chat,
     * then opens that chat and inserts the bot's username and the specified inline query in the input field.
     * You can specify which types of chats the user will be able to choose from.
     * It can be one or more of the following types: users, bots, groups, channels.
     *
     * @since Bot API 6.7+
     */
    fun switchInlineQuery(query: String, chooseChatTypes: String? = definedExternally)

    /**
     * A method that opens a link in an external browser. The Mini App will not be closed.
     * `Bot API 6.4+` If the optional options parameter is passed with the field try_instant_view=true,
     * the link will be opened in [Instant View](https://instantview.telegram.org/) mode if possible.
     *
     * Note that this method can be called only in response to user interaction with the Mini App interface (e.g. a click inside the Mini App or on the main button)
     */
    fun openLink(url: String, options: JsAny? = definedExternally)

    /**
     * A method that opens a telegram link inside the Telegram app. The Mini App will not be closed after this method is called.
     *
     * Up to `Bot API 7.0` The Mini App will be closed after this method is called.
     */
    fun openTelegramLink(url: String)

    /**
     * A method that opens an invoice using the link url. The Mini App will receive the event invoiceClosed when the invoice is closed.
     * If an optional callback parameter was passed, the callback function will be called and the invoice status will be passed as the first argument.
     *
     * @since Bot API 6.1+
     */
    fun openInvoice(url: String, callback: ((status: String) -> Unit)? = definedExternally)

    /**
     * A method that shows a native popup described by the params argument of the type PopupParams.
     * The Mini App will receive the [event](https://core.telegram.org/bots/webapps#events-available-for-mini-apps) popupClosed when the popup is closed.
     * If an optional callback parameter was passed, the callback function will be called and the field id of the pressed button will be passed as the first argument.
     *
     * @since Bot API 6.2+
     */
    fun showPopup(params: PopupParams, callback: ((buttonId: String?) -> Unit)? = definedExternally)

    /**
     * 
     */
    fun showAlert(message: String, callback: (() -> Unit)? = definedExternally)

    /**
     *
     */
    fun showConfirm(message: String, callback: ((result: Boolean) -> Unit)? = definedExternally)

    /**
     *
     */
    fun showScanQrPopup(params: dynamic, callback: ((data: String?) -> Boolean)? = definedExternally)

    /**
     *
     */
    fun closeScanQrPopup()

    /**
     *
     */
    fun readTextFromClipboard(callback: (data: String?) -> Unit)

    /**
     *
     */
    fun requestWriteAccess(callback: (allowed: Boolean) -> Unit)

    /**
     *
     */
    fun requestContact(callback: (sent: Boolean, data: dynamic) -> Unit)

    /**
     *
     */
    fun ready()

    /**
     *
     */
    fun expand()

    /**
     *
     */
    fun close()
}


