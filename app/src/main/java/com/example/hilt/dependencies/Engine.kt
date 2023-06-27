package com.example.hilt.dependencies

//接口的依赖注入，接口没有构造函数
interface Engine {
    //接口中有两个方法，启动引擎和关闭引擎
    fun start()
    fun shutdown()
}