package com.rychemrycho.app.mymind.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel: ViewModel() {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    protected fun addToDisposable(disposable: Disposable): Boolean {
        compositeDisposable.remove(disposable)
        return compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}