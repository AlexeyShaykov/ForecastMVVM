package com.example.forecastmvvm.data.responce

import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponce(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location,
    val request: Request
)