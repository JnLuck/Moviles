package com.upeu.practicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.upeu.practicas.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonAdapter
    private var person = List<Persona>?


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter = PersonAdapter(person)
        binding.recyclerPersona.layoutManager = LinearLayoutManager(this)
        binding.recyclerPersona.adapter = adapter
    }

    private fun getRetro():Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://192.168.31.166:8000/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    }

    private fun sPersonsa(){
        CoroutineScope(Dispatchers.IO).launch {
            val call:Response<Persona> = getRetro().create(ApiService::class.java).getAllPersonas("personas")
            val personas:Persona? = call.body()
            runOnUiThread{
                if (call.isSuccessful){
                    val ppersonas = personas ?: emptyList<Persona>()
                    person.?
                }else{
                    showError()
                }
            }
        }
    }

    private fun showError() {
        Toast.makeText(this, "Api no recarga", Toast.LENGTH_SHORT).show()
    }

}