package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.activitylifecycle.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private val ACTIVITY_THIRD = "ThirdActivityLifecycle"
    private lateinit var dataBinding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ACTIVITY_THIRD, "onCreate() method is called")
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_third)
        dataBinding.thirdactivity = this
        val thirduser = UserActivity("ThirdActivityScreen")
        dataBinding.thirduser= thirduser
    }


    fun buttonBackClick(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(ACTIVITY_THIRD, "onStart() method is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ACTIVITY_THIRD, "onPause() method is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ACTIVITY_THIRD, "onRestart() method is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ACTIVITY_THIRD, "onResume() method is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ACTIVITY_THIRD, "onStop() method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ACTIVITY_THIRD, "onDestroy() method is called")
    }
}