package com.lab27.daggerTutorialApp.base

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by "Avishek" on 8/19/2019.
 */
open class BaseViewModel : ViewModel() {

  protected val compositeDisposable = CompositeDisposable()

  override fun onCleared() {
    compositeDisposable.clear()
    super.onCleared()
  }
}
