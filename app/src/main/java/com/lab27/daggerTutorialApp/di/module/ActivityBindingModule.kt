package com.lab27.daggerTutorialApp.di.module

import com.lab27.daggerTutorialApp.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by "Avishek" on 8/19/2019.
 */
@Module
abstract class ActivityBindingModule {

  @ContributesAndroidInjector
  abstract fun contributeMainActivity(): MainActivity
}
