package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.activitylifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val ACTIVITY_SECOND = "SecondActivityLifecycle"

    private lateinit var dataBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        dataBinding.secondactivity = this
        val seconduser = UserActivity("SecondActivityScreen")
        dataBinding.usersecond = seconduser
        Log.d(ACTIVITY_SECOND, "onCreate() method is called")
    }

    fun buttonNextClick(){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    fun buttonBackClick(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(ACTIVITY_SECOND, "onStart() method is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ACTIVITY_SECOND, "onPause() method is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ACTIVITY_SECOND, "onRestart() method is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ACTIVITY_SECOND, "onResume() method is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ACTIVITY_SECOND, "onStop() method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ACTIVITY_SECOND, "onDestroy() method is called")
    }

}