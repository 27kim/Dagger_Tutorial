package com.lab27.daggerTutorialApp.di

import com.lab27.daggerTutorialApp.PurrfectApp
import com.lab27.daggerTutorialApp.di.module.*
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by "Avishek" on 8/19/2019.
 */
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            //install the module here
            ActivityBindingModule::class,
            CatModule::class,
            NetworkModule::class,
            AppModule::class,
            MainFragmentBindingModule::class
        ]
)
interface AppComponent : AndroidInjector<PurrfectApp>
