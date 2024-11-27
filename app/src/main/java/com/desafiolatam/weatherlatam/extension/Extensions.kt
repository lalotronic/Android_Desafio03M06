package com.desafiolatam.weatherlatam.extension

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import java.util.Calendar
import java.util.Locale

fun Long.toShortDateString(): String {
    val calendar = Calendar.getInstance(Locale.getDefault())
    calendar.timeInMillis = this
    return "${calendar.get(Calendar.HOUR_OF_DAY)}:${calendar.get(Calendar.MINUTE)}"
}

fun Double.toFahrenheit(): String {
    val fahrenheit = this * 9 / 5 + 32
    return String.format("%.2f", fahrenheit)
}

fun Double.toCelsius(): String {
    val celsius = (this - 32) * 5 / 9
    return String.format("%.2f", celsius)
}

fun DialogFragment.setupWidthToMatchParent() {
    dialog?.window?.setLayout(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}