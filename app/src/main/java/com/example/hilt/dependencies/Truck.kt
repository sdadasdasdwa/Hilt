package com.example.hilt.dependencies

import com.example.hilt.dependencies.Driver
import javax.inject.Inject

//带参数的依赖注入
class Truck @Inject constructor(val driver: Driver) {

    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    fun deliver() {

        gasEngine.start()
        electricEngine.start()
        println("Truck is delivering cargo， driven by $driver")
        gasEngine.shutdown()
        electricEngine.shutdown()
    }
}