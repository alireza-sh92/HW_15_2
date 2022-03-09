package com.example.hw_15_2.network.ui.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw_15_2.datamodel.User
import com.example.hw_15_2.network.NetworkManager
import retrofit2.Call
import retrofit2.Response

class ViewModelSignUp : ViewModel() {
    val failed by lazy {
        MutableLiveData(false)
    }
    private val _userId = MutableLiveData<String>()
    val userId: LiveData<String> = _userId

    fun creatUser(user: User) {
        val call = NetworkManager.service.createUser(user)
            .enqueue(object : retrofit2.Callback<String> {
                override fun onResponse(call: Call<String>, response: Response<String>) {
                    _userId.value = response.body() ?: "not valid!"
                }

                override fun onFailure(call: Call<String>, t: Throwable) {
                    failed.postValue(true)
                }
            })


    }
}