package com.example.hilt.dependencies

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    @BindGasEngine
    @Binds
    abstract fun bindGasEngine(gasEngine: GasEngine):Engine

    @BindElectricEngine
    @Binds
    abstract fun bindElectircEngine(electricEngine: ElectricEngine):Engine

}