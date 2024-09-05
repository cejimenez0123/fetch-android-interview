package com.example.fetch_android_interview.domain.usecases

import com.example.fetch_android_interview.data.models.ResponseList
import com.example.fetch_android_interview.data.models.ResponseListItem
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.URL
fun FetchListUseCase(): List<ResponseListItem>? {
        val url = URL("https://fetch-hiring.s3.amazonaws.com/hiring.json")
        val client = OkHttpClient()
        val gson = Gson()
        val request = Request.Builder().url(url).get().build()

        client.newCall(request).execute().use { response ->
            return if (response.isSuccessful) {
                val responseBody = response.body?.string()
                if (responseBody != null) {
                    gson.fromJson(responseBody, ResponseList::class.java).filter {
                       !it.name.isNullOrEmpty()
                    }
                } else {
                    null
                }
            } else {
                println("Request failed with status code: ${response.code}")
                null
            }
        }
}

