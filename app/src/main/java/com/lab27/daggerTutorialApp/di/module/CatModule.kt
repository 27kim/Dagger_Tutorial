package com.lab27.daggerTutorialApp.di.module

import com.lab27.daggerTutorialApp.repository.CatDataRepository
import com.lab27.daggerTutorialApp.repository.CatRepository
import com.lab27.daggerTutorialApp.service.CatService
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by "Avishek" on 8/20/2019.
 */
@Module
abstract class CatModule {
    @Binds
    abstract fun bindCatRepository(catDataRepository: CatDataRepository) : CatRepository
}
