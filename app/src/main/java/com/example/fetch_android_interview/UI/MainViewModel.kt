package com.example.fetch_android_interview.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetch_android_interview.data.models.ResponseListItem
import com.example.fetch_android_interview.domain.usecases.FetchListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel:ViewModel() {

    val dataSet = MutableStateFlow(listOf<ResponseListItem>())
    init {
        viewModelScope.launch {
            fetchList()
        }
    }
    private suspend fun fetchList()= withContext(Dispatchers.IO) {
       FetchListUseCase()?.apply {
           println(this)
           dataSet.value=this.sortedBy { it.name!!.split(" ")[1].toInt() } }

    }
}