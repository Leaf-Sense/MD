package com.bangkit.leafsense.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bangkit.leafsense.data.response.Data
import com.bangkit.leafsense.data.response.DetailResponse

class DetailViewModel : ViewModel() {

    private val _detailData = MutableLiveData<Data>()
    val detailData: LiveData<Data> get() = _detailData

    fun setDetailData(response: DetailResponse) {
        _detailData.value = response.data
    }
}
