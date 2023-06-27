package com.example.hilt.dependencies

import com.example.hilt.dependencies.Driver
import javax.inject.Inject

//带参数的依赖注入
class Truck @Inject constructor(val driver: Driver){
    fun deliver(){
        println("Truck is delivering cargo， driven by $driver")

    }
}