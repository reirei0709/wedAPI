package app.itakura.reirei.webapi

import com.google.gson.annotations.SerializedName

class User (val name:String,
            @SerializedName("loogin") val userId:String,
            @SerializedName("avater_url") val avatarUrl:String,
            val following:Int,
            val follwers:Int
)