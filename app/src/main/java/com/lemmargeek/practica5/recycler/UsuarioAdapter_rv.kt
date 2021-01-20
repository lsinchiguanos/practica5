package com.lemmargeek.practica5.recycler

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lemmargeek.practica5.models.Usuario

class UsuarioAdapter_rv(val usuario:List<Usuario>):RecyclerView.Adapter<UsuarioAdapter_rv.UsuarioHolder>() {

    class UsuarioHolder(val view: View): RecyclerView.ViewHolder(view){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: UsuarioHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = usuario.size
}