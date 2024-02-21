package com.example.androidtest

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import com.effective.android.panel.PanelSwitchHelper

class MainActivity : ComponentActivity() {

    private var helper: PanelSwitchHelper? = null

    private lateinit var rvImage: RecyclerView

    private lateinit var etContent: EditText

    private lateinit var nestedScroll: NestedScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        findViewById<View>(R.id.btn_camera).setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->

                val resolve = takePictureIntent.resolveActivity(packageManager)
                if (resolve != null) {
                    startActivityForResult(takePictureIntent, 999)
                } else {
                    Log.d("zycTest", "resolve failed")
                }

            }

            //调用系统相机
            val intentCamera = Intent()
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                intentCamera.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION) //添加这一句表示对目标应用临时授权该Uri所代表的文件
//            }
            intentCamera.action = MediaStore.ACTION_IMAGE_CAPTURE
//            startActivityForResult(intentCamera, 909)


            val resolve = intentCamera.resolveActivity(packageManager)
            if (resolve != null) {
                startActivityForResult(intentCamera, 999)
            } else {
                Log.d("zycTest", "resolve failed")
            }

        }

    }


}