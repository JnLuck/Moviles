package com.upeu.practicas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(val person: Persona):RecyclerView.Adapter<PersonaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return PersonaViewHolder(layoutInflater.inflate(R.layout.item_persona, parent, false))
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val item:Persona = person
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return person.id
    }
}