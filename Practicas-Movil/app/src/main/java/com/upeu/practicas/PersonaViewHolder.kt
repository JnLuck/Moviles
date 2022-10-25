package com.upeu.practicas

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.upeu.practicas.databinding.ItemPersonaBinding

class PersonaViewHolder(view:View): RecyclerView.ViewHolder(view) {
    private val binding = ItemPersonaBinding.bind(view)
    fun bind(person:Persona){
        binding.textNombre
        binding.textApellidos
    }
}