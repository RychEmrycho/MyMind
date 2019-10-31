package com.rychemrycho.app.mymind.di.component

import com.rychemrycho.app.mymind.base.BaseApplication
import com.rychemrycho.app.mymind.di.module.ActivityModule
import com.rychemrycho.app.mymind.di.module.ApplicationModule
import com.rychemrycho.app.mymind.di.module.ViewModelModule
import com.rychemrycho.app.mymind.di.module.WebServiceModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ApplicationModule::class, ActivityModule::class, ViewModelModule::class, WebServiceModule::class])
interface ApplicationComponent:AndroidInjector<BaseApplication> {
    @Component.Factory
    abstract class Factory: AndroidInjector.Factory<BaseApplication>
}