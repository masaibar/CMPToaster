@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.masaibar.cmptoaster

import androidx.compose.runtime.Composable

/**
 * A lightweight, Android-style toast for Compose Multiplatform.
 *
 * - **Android**: delegates to the native [android.widget.Toast].
 * - **iOS**: there is no native toast, so a transient overlay is rendered on a
 *   dedicated [platform.UIKit.UIWindow] above normal app content. The iOS window
 *   is configured not to receive touch events.
 */
expect class Toast {
  /**
   * Shows [message] for the given [duration].
   */
  fun show(
    message: String,
    duration: ToastDuration = ToastDuration.SHORT
  )
}

enum class ToastDuration {
  SHORT,
  LONG
}

/**
 * Returns a [Toast] bound to the current platform context.
 *
 * On Android it captures the `LocalContext`, so call it from within composition.
 */
@Composable
expect fun rememberToast(): Toast
