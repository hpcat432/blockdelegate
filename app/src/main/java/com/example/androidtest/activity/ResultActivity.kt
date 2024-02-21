package com.example.androidtest.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.androidtest.R

class ResultActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_activity_layout)
        findViewById<View>(R.id.btn_back).setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("myKey", "result data from second")
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }

}