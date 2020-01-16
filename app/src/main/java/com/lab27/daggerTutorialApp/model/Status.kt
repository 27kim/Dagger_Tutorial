package com.lab27.daggerTutorialApp.model

/**
 * Created by "Avishek" on 8/22/2019.
 */
/**
 * Status of a resource that is provided to the UI.
 *
 *
 * These are usually created by the Repository classes where they return
 * `LiveData<Resource<T>>` to pass back the latest data to the UI with its fetch status.
 */
enum class Status {
  SUCCESS,
  ERROR,
  LOADING
}
