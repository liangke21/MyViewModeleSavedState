package com.example.myviewmodelesavedstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.example.myviewmodelesavedstate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainActivityViewModel by lazy { ViewModelProvider(this, SavedStateViewModelFactory(application, this)).get(MainActivityViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.data = mainActivityViewModel
        binding.lifecycleOwner = this
    }

    companion object {

        const val KEY_NAME = "name"
    }
}