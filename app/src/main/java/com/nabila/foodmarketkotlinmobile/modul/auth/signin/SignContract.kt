package com.nabila.foodmarketkotlinmobile.modul.auth.signin

import com.nabila.foodmarketkotlinmobile.base.BasePresenter
import com.nabila.foodmarketkotlinmobile.base.BaseView
import com.nabila.foodmarketkotlinmobile.model.response.login.LoginResponse

interface SignContract {

    interface View: BaseView {
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailed(message:String)
    }

    interface Presenter : SignContract, BasePresenter {
        fun submitLogin(email:String, password:String)
    }
}