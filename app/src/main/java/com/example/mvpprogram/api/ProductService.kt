package com.example.mvpprogram.api

import com.example.mvpprogram.model.Product
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET

interface ProductService {

    @GET("products.php")
    suspend fun products(): Response<ArrayList<Product>>

    @GET("products.php")
    fun rxProducts(): Single<List<Product>>

}