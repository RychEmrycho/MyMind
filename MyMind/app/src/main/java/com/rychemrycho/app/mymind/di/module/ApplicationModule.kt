package com.rychemrycho.app.mymind.di.module

import android.content.Context
import com.rychemrycho.app.mymind.base.BaseApplication
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {
    @Binds
    abstract fun bindContext(application: BaseApplication): Context
}