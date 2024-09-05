package com.example.fetch_android_interview.UI

import androidx.lifecycle.ViewModel
import com.example.fetch_android_interview.data.models.ResponseListItem
import com.example.fetch_android_interview.domain.usecases.FetchListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext

class MainViewModel:ViewModel() {

    val dataSet = MutableStateFlow(listOf<ResponseListItem>())

    suspend fun fetchList()= withContext(Dispatchers.IO) {
       FetchListUseCase()?.apply { dataSet.value=this }

    }
}