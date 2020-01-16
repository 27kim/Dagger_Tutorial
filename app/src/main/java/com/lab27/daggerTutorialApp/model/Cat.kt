package com.lab27.daggerTutorialApp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by "Avishek" on 8/19/2019.
 */

data class Cat(
  @SerializedName("id") val id: String,
  @SerializedName("url") val url: String
)
