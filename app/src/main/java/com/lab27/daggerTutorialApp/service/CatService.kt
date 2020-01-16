package com.lab27.daggerTutorialApp.service

import com.lab27.daggerTutorialApp.model.Cat
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by "Avishek" on 8/19/2019.
 */

interface CatService {

  @GET("images/search?page=1&limit=30")
  fun getCats(): Observable<List<Cat>>

  @GET("images/{image_id}")
  fun getCat(@Path("image_id") id: String): Observable<Cat>
}
