package com.example.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.dependencies.Engine
import com.example.hilt.dependencies.Truck
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var okHttpClient:OkHttpClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        truck.deliver()



    }
}