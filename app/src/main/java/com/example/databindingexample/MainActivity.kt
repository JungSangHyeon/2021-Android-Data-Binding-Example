package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.databindingexample.databinding.ActivityMain3Binding

class MainActivity : AppCompatActivity() {

    val text = ObservableField("Random Number")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val binding: ActivityMain3Binding = DataBindingUtil.setContentView(this, R.layout.activity_main3)
        binding.mainActivity = this
    }

    fun onButtonPressed() {
        text.set((0..10).random().toString())
    }
}