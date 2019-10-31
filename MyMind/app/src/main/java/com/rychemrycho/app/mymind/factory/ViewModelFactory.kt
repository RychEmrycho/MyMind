package com.rychemrycho.app.mymind.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Suppress("UNCHECKED_CAST")
@Singleton
class ViewModelFactory @Inject constructor(private val viewModelMap: MutableMap<Class<out ViewModel>, Provider<ViewModel>>): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        var creator: Provider<out ViewModel>? = viewModelMap[modelClass]

        if (creator == null) {
            viewModelMap.let {
                for ((key, value) in viewModelMap) {
                    if (modelClass.isAssignableFrom(key)) {
                        creator = value
                        break
                    }
                }
            }
        }
        requireNotNull(creator) { "ViewModel not found. Unknown ViewModel class: $modelClass" }
        try {
            return creator?.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}