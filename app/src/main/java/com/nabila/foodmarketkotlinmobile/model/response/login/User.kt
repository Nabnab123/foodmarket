package com.nabila.foodmarketkotlinmobile.model.response.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @Expose
    @SerializedName("address")
    val profile_photo_url: String,
    @Expose
    @SerializedName("address")
    val address: String,
    @Expose
    @SerializedName("city")
    val city: String,
    @Expose
    @SerializedName("roles")
    val roles: String,
    @Expose
    @SerializedName("houseNumber")
    val houseNumber: String,
    @Expose
    @SerializedName("created_at")
    val createdAt: Long,
    @Expose
    @SerializedName("phoneNumber")
    val phoneNumber: String,
    @Expose
    @SerializedName("updated_at")
    val updatedAt: Long,
    @Expose
    @SerializedName("name")
    val name: String,
    @Expose
    @SerializedName("id")
    val id: Int,
    @Expose
    @SerializedName("profile_photo_path")
    val profile_photo_path: String,
    @Expose
    @SerializedName("email")
    val email: String,
    @Expose
    @SerializedName("email_verified_at")
    val email_verified_at: String,
    @Expose
    @SerializedName("current_team_id")
    val current_team_id: Any
)
