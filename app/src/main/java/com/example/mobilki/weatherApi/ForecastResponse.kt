package com.example.mobilki.weatherApi

import com.google.gson.annotations.SerializedName

// Аннотация @SerializedName указывает на соответствие имени поля в JSON-ответе и имени свойства в классе.
// cod - строковое поле, содержащее код ответа от сервера.
// message - числовое поле, содержащее вероятность правильности ответа от сервера.
// count - целочисленное поле, содержащее количество прогнозов погоды в ответе.
// hourlyForecasts - список объектов WeatherResponse, содержащих информацию о прогнозе погоды на каждый час.

data class ForecastResponse(
    @SerializedName("cod")
    val cod: String,
    @SerializedName("message")
    val message: Double,
    @SerializedName("cnt")
    val count: Int,
    @SerializedName("list")
    val hourlyForecasts: List<WeatherResponse>,
)


