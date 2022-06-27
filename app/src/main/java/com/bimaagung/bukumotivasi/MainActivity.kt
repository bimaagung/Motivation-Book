package com.bimaagung.bukumotivasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvSepatu: RecyclerView
    private var list: ArrayList<Sepatu> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maintoolbar.tb_about.setOnClickListener {
            var i = Intent(this, About::class.java)
            startActivity(i)
        }

        rvSepatu = findViewById(R.id.rv_sepatu)
        rvSepatu.setHasFixedSize(true)

        list.addAll(SepatuData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSepatu.layoutManager = LinearLayoutManager(this)
        val ListSepatuAdapter = ListSepatuAdapter(this,list)
        rvSepatu.adapter = ListSepatuAdapter
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.menu_about, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val id = item.getItemId()
//
//        if (id == R.id.about) {
//
//            var i = Intent(this, About::class.java)
//            startActivity(i)
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}
