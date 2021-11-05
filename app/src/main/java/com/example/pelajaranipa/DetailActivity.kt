package com.example.pelajaranipa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Penjelasan Pelajaran"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.biologi))
        textViewpelajaranDetail.text = intent.getStringExtra("judul")
        textViewpenjelasanDetail.text = intent.getStringExtra("penjelasan")


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
