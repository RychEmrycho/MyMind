package com.rychemrycho.app.mymind.base

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import dagger.android.support.DaggerFragment

abstract class BaseFragment: DaggerFragment() {
    private var activity: AppCompatActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as AppCompatActivity
    }

    override fun onDetach() {
        super.onDetach()
        activity = null
    }

    protected fun getBaseActivity(): AppCompatActivity? {
        return activity
    }
}