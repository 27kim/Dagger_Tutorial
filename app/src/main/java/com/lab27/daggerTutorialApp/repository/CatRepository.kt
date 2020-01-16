package com.lab27.daggerTutorialApp.repository

import com.lab27.daggerTutorialApp.model.Cat
import io.reactivex.Observable

/**
 * Created by "Avishek" on 8/19/2019.
 */
interface CatRepository {

  fun getCuteCatImages(): Observable<List<Cat>>

  fun getImageOfTheCuteCat(id: String): Observable<Cat>
}
