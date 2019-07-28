package com.arturarzumanyan.daggerexample

import javax.inject.Inject

class Wheels @Inject constructor(private val rims: Rims, private val tires: Tires) {
    //we don't own this class so we can't annotate it with @Inject
}