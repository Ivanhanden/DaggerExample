package com.arturarzumanyan.daggerexample

import android.util.Log

class Tires {
    //we don't own this class so we can't annotate it with @Inject

    private val TAG = "Car"

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}