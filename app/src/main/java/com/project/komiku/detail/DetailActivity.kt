package com.project.komiku.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.komiku.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_SINOPSIS = "extra_sinopsis"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        val actionbar = supportActionBar
        actionbar!!.title="Detail Anime"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val tvPhoto: ImageView = findViewById(R.id.tv_pict_anime)
        val tvName: TextView = findViewById(R.id.tv_anime_name)
        val tvGenre: TextView = findViewById(R.id.tv_anime_genre)
        val tvSinopsis: TextView = findViewById(R.id.tv_anime_sinopsis)

        val Movephoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val Movename = intent.getStringExtra(EXTRA_NAME)
        val Movegenre = intent.getStringExtra(EXTRA_GENRE)
        val Movesinopsis = intent.getStringExtra(EXTRA_SINOPSIS)

        Glide.with(this)
            .load(Movephoto)
            .apply(RequestOptions())
            .into(tvPhoto)
        tvName.text = Movename
        tvGenre.text = Movegenre
        tvSinopsis.text = Movesinopsis

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}