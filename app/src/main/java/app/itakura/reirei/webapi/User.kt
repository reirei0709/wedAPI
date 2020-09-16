package app.itakura.reirei.webapi

import com.google.gson.annotations.SerializedName

class User (val name:String,
            @SerializedName("login") val userId:String,
            @SerializedName("avatar_url") val avatarUrl:String,
            val following:Int,
            val followers:Int
)