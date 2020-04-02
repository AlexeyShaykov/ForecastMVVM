package com.example.forecastmvvm.data.db.unitlocalized

import androidx.room.ColumnInfo

data class MetricCurrentWeatherEntry(
    @ColumnInfo(name="temperature")
    override val temperature: Int,
    @ColumnInfo(name="wind_speed")
    override val windSpeed: Int,
    @ColumnInfo(name="wind_dir")
    override val windDir: String,
    @ColumnInfo(name="pressure")
    override val precipitationVolume: Int,
    @ColumnInfo(name="feelslike")
    override val feelsLikeTemperature: Int,
    @ColumnInfo(name="visibility")
    override val visibilityDistance: Int

):UnitSpecificCurrentWeatherEntry