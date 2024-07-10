package io.github.devcrocod.tma

@JsModule("telegram-web-apps.js")
/**
 * Mini Apps can [adjust the appearance](https://core.telegram.org/bots/webapps#color-schemes) of the interface to match the Telegram user's app in real time.
 * This object contains the user's current theme settings:
 *
 * @property bg_color Optional. Background color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-bg-color`).
 * @property text_color Optional. Main text color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-text-color`).
 * @property hint_color Optional. Hint text color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-hint-color`).
 * @property link_color Optional. Link color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-link-color`).
 * @property button_color Optional. Button color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-button-color`).
 * @property button_text_color Optional. Button text color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-button-text-color`).
 * @property secondary_bg_color Optional. Bot API 6.1+ Secondary background color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-secondary-bg-color`).
 * @property header_bg_color Optional. Bot API 7.0+ Header background color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-header-bg-color`).
 * @property accent_text_color Optional. Bot API 7.0+ Accent text color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-accent-text-color`).
 * @property section_bg_color Optional. Bot API 7.0+ Background color for the section in the `#RRGGBB` format.
 * It is recommended to use this in conjunction with secondary_bg_color.
 * Also available as the CSS variable var(`--tg-theme-section-bg-color`).
 * @property section_header_text_color Optional. Bot API 7.0+ Header text color for the section in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-section-header-text-color`).
 * @property section_separator_color Optional. Bot API 7.6+ Section separator color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-section-separator-color`).
 * @property subtitle_text_color Optional. Bot API 7.0+ Subtitle text color in the `#RRGGBB` format.
 * Also available as the CSS variable var(`--tg-theme-subtitle-text-color`).
 * @property destructive_text_color Optional. Bot API 7.0+ Text color for destructive actions in the `#RRGGBB`format.
 * Also available as the CSS variable var(`--tg-theme-destructive-text-color`)
 */
external class ThemeParams(
    bg_color: String?,
    text_color: String?,
    hint_color: String?,
    link_color: String?,
    button_color: String?,
    button_text_color: String?,
    secondary_bg_color: String?,
    header_bg_color: String?,
    accent_text_color: String?,
    section_bg_color: String?,
    section_header_text_color: String?,
    section_separator_color: String?,
    subtitle_text_color: String?,
    destructive_text_color: String?
) : JsAny {
    val bg_color: String?
    val text_color: String?
    val hint_color: String?
    val link_color: String?
    val button_color: String?
    val button_text_color: String?
    val secondary_bg_color: String?
    val header_bg_color: String?
    val accent_text_color: String?
    val section_bg_color: String?
    val section_header_text_color: String?
    val section_separator_color: String?
    val subtitle_text_color: String?
    val destructive_text_color: String?
}