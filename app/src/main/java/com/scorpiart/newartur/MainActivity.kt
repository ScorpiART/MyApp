package com.scorpiart.newartur

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.scorpiart.newartur.databinding.ActivityMain2Binding
import com.scorpiart.newartur.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLog","Ты видел деву на скале\n" +
                "В одежде белой над волнами")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog","Когда, бушуя в бурной мгле,\n" +
                "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog","Когда луч молний озарял\n" +
                "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog","И ветер бился и летал\n" +
                "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","Прекрасно море в бурной мгле\n" +
                "И небо в блесках без лазури;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","Но верь мне: дева на скале\n" +
                "Прекрасней волн, небес и бури.")
    }

}