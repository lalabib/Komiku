package com.project.komiku

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val photoProfile: ImageView = findViewById(R.id.photoProfile)
        val photo = R.drawable.photo_profile

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(photoProfile)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}