//bibliografia: https://github.com/google-developer-training/android-kotlin-fundamentals-starter-apps/blob/master/MarsRealEstate-Starter/app/src/main/java/com/example/android/marsrealestate/overview/OverviewViewModel.kt

package com.example.laboratorio8.noticias
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoticiasViewModel: ViewModel() {
    // The internal MutableLiveData String that stores the most recent response
    private val _response = MutableLiveData<String>()

    // The external immutable LiveData for the response String
    val response: LiveData<String>
        get() = _response

    /**
     * Call getMarsRealEstateProperties() on init so we can display status immediately.
     */
    init {
        getNewsProperties()
    }

    /**
     * Sets the value of the status LiveData to the Mars API status.
     */
    private fun getNewsProperties() {
        _response.value = "Response here!"
    }
}
