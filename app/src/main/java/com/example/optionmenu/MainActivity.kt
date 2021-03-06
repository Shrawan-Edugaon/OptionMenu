package com.example.optionmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var background:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        background = findViewById<LinearLayout>(R.id.back) as LinearLayout
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item!!.itemId)
        {
            R.id.redColor->background.setBackgroundColor(Color.parseColor("#FF0000"))
            R.id.greenColor->background.setBackgroundColor(Color.parseColor("#00FF00"))
            R.id.blueColor->background.setBackgroundColor(Color.parseColor("#0000FF"))

            R.id.text->Toast.makeText(this@MainActivity,"This item will be shown always on the action bar",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}