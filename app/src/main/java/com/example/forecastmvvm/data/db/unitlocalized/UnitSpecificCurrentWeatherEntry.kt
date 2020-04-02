package com.example.forecastmvvm.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Int
    val windSpeed: Int
    val windDir: String
    val precipitationVolume: Int
    val feelsLikeTemperature: Int
    val visibilityDistance: Int
}