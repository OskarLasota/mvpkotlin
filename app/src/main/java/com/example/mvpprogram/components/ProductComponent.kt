package com.example.mvpprogram.components

import com.example.mvpprogram.modules.ProductModule
import com.example.mvpprogram.modules.RetrofitModule
import com.example.mvpprogram.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ProductModule::class, RetrofitModule::class])
interface ProductComponent {
    fun inject(app: MainActivity)

    //fun inject(frag : TestFragment)
}