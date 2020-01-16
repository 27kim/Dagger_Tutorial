package com.lab27.daggerTutorialApp.ui

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.lab27.daggerTutorialApp.base.BaseViewModel
import com.lab27.daggerTutorialApp.model.Cat
import com.lab27.daggerTutorialApp.model.Resource
import com.lab27.daggerTutorialApp.repository.CatRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by "Avishek" on 8/19/2019.
 */
class MainViewModel
@Inject
constructor(private val catRepository: CatRepository) : BaseViewModel() {

  val catsLiveData = MutableLiveData<Resource<List<Cat>>>()
  val catLiveData = MutableLiveData<Resource<Cat>>()

  init {
    catRepository.getCuteCatImages()
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .doOnSubscribe {
        compositeDisposable.add(it)
        catsLiveData.value = Resource.loading(null)
      }
      .subscribe(
        {
          catsLiveData.value = Resource.success(it)
        },
        {
          Log.e(javaClass.simpleName, it.message)
          catsLiveData.value = Resource.error(it.localizedMessage, null)
          it.printStackTrace()
        }
      )
  }

  fun getCatImage(id: String) {
    catRepository.getImageOfTheCuteCat(id)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .doOnSubscribe {
        compositeDisposable.add(it)
        catLiveData.value = Resource.loading(null)
      }
      .subscribe(
        {
          catLiveData.value = Resource.success(it)
        },
        {
          Log.e(javaClass.simpleName, it.message)
          catLiveData.value = Resource.error(it.localizedMessage, null)
          it.printStackTrace()
        }
      )
  }
}
