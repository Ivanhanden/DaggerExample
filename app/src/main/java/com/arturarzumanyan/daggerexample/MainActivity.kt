package com.arturarzumanyan.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car: Car

        val carComponent: CarComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        car.drive()
    }
}
