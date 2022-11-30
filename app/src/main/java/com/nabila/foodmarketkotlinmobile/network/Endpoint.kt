package com.nabila.foodmarketkotlinmobile.network

import com.nabila.foodmarketkotlinmobile.model.response.Wrapper
import com.nabila.foodmarketkotlinmobile.model.response.login.LoginResponse
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.*

interface Endpoint {

    @FormUrlEncoded
    @POST("Login")
    fun login(@Field("email")email:String,
    @Field("password") password: String) : Observable<Wrapper<LoginResponse>>
}