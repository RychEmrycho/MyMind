package com.rychemrycho.app.mymind.base

import com.rychemrycho.app.mymind.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
         return DaggerApplicationComponent.factory().create(this)
    }
}