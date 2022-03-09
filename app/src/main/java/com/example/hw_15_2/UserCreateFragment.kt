package com.example.hw_15_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hw_15_2.databinding.UserCreateFragmentBinding
import com.example.hw_15_2.network.ui.signup.ViewModelSignUp

class UserCreateFragment:Fragment(R.layout.user_create_fragment) {
    private val modle: ViewModelSignUp by viewModels()
    lateinit var binding: UserCreateFragmentBinding

}