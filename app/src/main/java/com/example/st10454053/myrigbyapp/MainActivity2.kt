package com.example.st10454053.myrigbyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {

    private lateinit var playProgressBar: ProgressBar
    private lateinit var washProgressBar: ProgressBar
    private lateinit var eatProgressBar: ProgressBar

    private var playProgressStatus: Int = 0
    private var washProgressStatus: Int = 0
    private var eatProgressStatus: Int = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //declarations
        playProgressBar= findViewById<ProgressBar>(R.id.playProgressBar)
        washProgressBar= findViewById<ProgressBar>(R.id.washProgressBar)
        eatProgressBar= findViewById<ProgressBar>(R.id.eatProgressBar)

        val washbutton= findViewById<Button>(R.id.WASHbutton)
        val eatbutton= findViewById<Button>(R.id.EATbutton)
        val playbutton= findViewById<Button>(R.id.PLAYbutton)
        val imageView= findViewById<ImageView>(R.id.petimageview)

        playbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.rigby_playing)
            playProgressStatus = 0
            playProgressBar.progress = playProgressStatus
            Thread(Runnable {
                while (playProgressStatus < 100) {
                    playProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        playProgressBar.progress = playProgressStatus
                    }
                }
                runOnUiThread {

                }
            }).start()
        }

        washbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.rigby_bath)
            washProgressStatus = 0
            washProgressBar.progress = washProgressStatus
            Thread(Runnable {
                while (washProgressStatus < 100) {
                    washProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        washProgressBar.progress = washProgressStatus
                    }
                }
                runOnUiThread {

                }
            }).start()
        }

        eatbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.rigby_eating)
            eatProgressStatus = 0
            eatProgressBar.progress = eatProgressStatus
            Thread(Runnable {
                while (eatProgressStatus < 100) {
                    eatProgressStatus += 5
                    Thread.sleep(1000)
                    runOnUiThread {
                        eatProgressBar.progress = eatProgressStatus
                    }
                }
                runOnUiThread {

                }
            }).start()
        }}}
