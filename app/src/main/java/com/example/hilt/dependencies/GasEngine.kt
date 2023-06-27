package com.example.hilt.dependencies

import javax.inject.Inject

class GasEngine @Inject constructor(): Engine{
    override fun start() {
        println("Gas engine start.")
    }

    override fun shutdown() {
        println("Gas engine shutdowns.")
    }

}