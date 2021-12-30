package com.example.myviewmodelesavedstate


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainActivityViewModel(private val state: SavedStateHandle) : ViewModel() {

    fun getName(): MutableLiveData<Int> {
        if (!state.contains(MainActivity.KEY_NAME)) {//不包含就创建
            state.set(MainActivity.KEY_NAME, 0)
        }
        return state.getLiveData(MainActivity.KEY_NAME)
    }

    fun add() {
        getName().value = getName().value?.plus(1)
    }

}