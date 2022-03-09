package com.example.hw_15_2.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {
    private const val baseUrl = "http://papp.ir/api/v1/"
    private val client = OkHttpClient.Builder()
        .addInterceptor(createInterceptor())
        .build()

    val retrofit: Retrofit = Retrofit
        .Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    private fun createInterceptor(): Interceptor {
        return object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val oldRequest = chain.request()
                val newRequest = oldRequest.newBuilder()
                    .addHeader("Authorization", "Bearer qwersafasdf")
                    .build()
                return chain.proceed(newRequest)
            }

        }
    }

    val service = retrofit.create(APISrevices::class.java)
}