package com.lab27.daggerTutorialApp.di.module

import com.lab27.daggerTutorialApp.ui.CatFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by "Avishek" on 8/20/2019.
 */
@Module
abstract class MainFragmentBindingModule {

  @ContributesAndroidInjector
  abstract fun contributeCatFragment(): CatFragment
}
