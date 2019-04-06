package com.arturarzumanyan.daggerexample

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {
    companion object {
        const val TAG = "Car"
    }

    fun drive(){
        Log.d(TAG, "driving...")
    }
}