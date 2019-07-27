package com.arturarzumanyan.daggerexample

import android.util.Log
import javax.inject.Inject


class Remote @Inject constructor() {
    private val TAG = "Car"

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }
}