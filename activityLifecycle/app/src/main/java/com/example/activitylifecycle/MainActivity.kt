package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding
    private val ACTIVITY_MAIN = "ActivityLifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        dataBinding.mainactivity = this
        val user = UserActivity("MainActivityScreen")
        dataBinding.useractivity = user
        Log.d(ACTIVITY_MAIN, "onCreate() method is called")
    }

    fun buttonClickNext(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

    }


    override fun onStart() {
        super.onStart()
        Log.d(ACTIVITY_MAIN, "onStart() method is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ACTIVITY_MAIN, "onPause() method is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ACTIVITY_MAIN, "onRestart() method is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ACTIVITY_MAIN, "onResume() method is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ACTIVITY_MAIN, "onStop() method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ACTIVITY_MAIN, "onDestroy() method is called")
    }

}