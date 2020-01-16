package com.lab27.daggerTutorialApp

import android.app.Application
import com.lab27.daggerTutorialApp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

/**
 * Created by "Avishek" on 8/19/2019.
 */
class PurrfectApp : Application(), HasAndroidInjector {

  @Inject
  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

  override fun onCreate() {
    super.onCreate()

    DaggerAppComponent.create().inject(this)
  }

  /** Returns an [AndroidInjector].  */
  override fun androidInjector(): AndroidInjector<Any> {
    return dispatchingAndroidInjector
  }
}
