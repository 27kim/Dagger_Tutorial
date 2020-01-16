package com.lab27.daggerTutorialApp.repository

import com.lab27.daggerTutorialApp.model.Cat
import com.lab27.daggerTutorialApp.service.CatService
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by "Avishek" on 8/19/2019.
 */
class CatDataRepository
@Inject
constructor(private val catService: CatService) : CatRepository {

  override fun getCuteCatImages(): Observable<List<Cat>> {
    return catService.getCats()
  }

  override fun getImageOfTheCuteCat(id: String): Observable<Cat> {
    return catService.getCat(id)
  }
}
