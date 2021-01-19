package com.lemmargeek.practica5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Toolbar", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.moremenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemView = item.itemId

        when(itemView){
            R.id.new_group -> Toast.makeText(applicationContext, "Nuevo Grupo", Toast.LENGTH_SHORT).show()
            R.id.new_difusion -> Toast.makeText(applicationContext, "Nuevo mensaje de difusión", Toast.LENGTH_SHORT).show()
            R.id.scan_web -> Toast.makeText(applicationContext, "Escaner QR Web", Toast.LENGTH_SHORT).show()
            R.id.msg_top -> Toast.makeText(applicationContext, "Mensajes destacados", Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(applicationContext, "Ajustes", Toast.LENGTH_SHORT).show()
        }

        return false

    }
}