package com.example.mvpprogram.modules

import com.example.mvpprogram.api.ProductService
import com.example.mvpprogram.contract.ContractInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
class ProductModule {

    @Singleton
    @Provides
    fun provideProductService(retrofit : Retrofit) = retrofit.create(ProductService::class.java)



}