package com.hungry.binareats.presentation.feature.splashscreen

import androidx.lifecycle.ViewModel
import com.hungry.binareats.data.repository.UserRepository

class SplashViewModel(
    private val repo: UserRepository
) : ViewModel() {

    fun isUserLoggedIn() = repo.isLoggedIn()

}