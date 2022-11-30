//YApi QuickType插件生成，具体参考文档:https://github.com/RmondJone/YapiQuickType

package com.nabila.foodmarketkotlinmobile.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.nabila.foodmarketkotlinmobile.model.response.login.LoginResponse

data class Wrapper<T>(
    @Expose
    @SerializedName("data")
    val data: T?=null,
    @Expose
    @SerializedName("meta")
    val meta: Meta ? = null
)

