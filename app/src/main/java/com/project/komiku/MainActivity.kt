package com.project.komiku

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    private var doubleBackToExitPressedOnce: Boolean = false

    private lateinit var rvAnime: RecyclerView
    private var list: ArrayList<Anime> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "Anime"

        rvAnime = findViewById(R.id.rv_anime)
        rvAnime.setHasFixedSize(true)

        list.addAll(DetailAnime.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAnime.layoutManager = LinearLayoutManager(this)
        val animeAdapter = AnimeAdapter(list)
        rvAnime.adapter = animeAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemSelected: Int) {
        when (itemSelected) {
            R.id.menuProfile -> {
                val about = Intent(this, AboutActivity::class.java)
                startActivity(about)
            }
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            finish()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }

}