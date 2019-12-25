package com.aks4125.network

import com.aks4125.network.ApiConstants
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.GET

interface WebService {
    @GET(ApiConstants.SAMPLE)
    suspend fun getResponse(): Response<JsonObject>
}