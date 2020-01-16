package com.lab27.daggerTutorialApp.di.module

import com.lab27.daggerTutorialApp.util.scheduler.AndroidSchedulerProvider
import com.lab27.daggerTutorialApp.util.scheduler.SchedulerProvider
import dagger.Binds
import dagger.Module

/**
 * Created by "Avishek" on 8/20/2019.
 */
@Module
abstract class AppModule {

  @Binds
  abstract fun bindSchedulerProvider(androidSchedulerProvider: AndroidSchedulerProvider): SchedulerProvider
}
