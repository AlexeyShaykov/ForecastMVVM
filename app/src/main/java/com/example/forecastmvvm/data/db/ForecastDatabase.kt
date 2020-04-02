package com.example.forecastmvvm.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.forecastmvvm.data.db.entity.CurrentWeatherEntry

@Database(
    entities = [CurrentWeatherEntry::class],
    version = 1
)
abstract class ForecastDatabase: RoomDatabase() {
    abstract fun currentDaoWeather(): CurrentWeatherDao

    companion object {
        @Volatile private var instance: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(contex: Context) = instance ?: synchronized(LOCK) {
            instance ?: builderDatabase(contex).also { instance = it }
        }

        private fun builderDatabase(contex: Context) = Room.databaseBuilder(contex.applicationContext,
                                                        ForecastDatabase::class.java, "forecast.db")
                                                        .build()
    }
}