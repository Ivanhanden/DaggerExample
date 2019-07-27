package com.arturarzumanyan.daggerexample

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(
    @Inject @JvmField var engine: Engine,
    @Inject @JvmField var wheels: Wheels
) {
    companion object {
        const val TAG = "Car"
    }

    fun drive() {
        Log.d(TAG, "driving...")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}