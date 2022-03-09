package com.example.hw_15_2.network

import com.example.hw_15_2.datamodel.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface APISrevices {
    @POST("users")
    fun createUser(
        @Body user: User
    ):Call<String>

}