package com.lemmargeek.practica5

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
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

        /* Puedo omitir el uso de esta variable */
        menuInflater.inflate(R.menu.moremenu, menu)
        val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchItem = menu?.findItem(R.id.search)
        val searchView = searchItem?.actionView as SearchView

        searchView.setSearchableInfo(manager.getSearchableInfo(componentName))

        /* Esto podría colocar en una función aparte */
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean{
                searchView.clearFocus()
                searchView.setQuery("",false)
                searchItem.collapseActionView()
                Toast.makeText(this@MainActivity, "$query", Toast.LENGTH_LONG).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })

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