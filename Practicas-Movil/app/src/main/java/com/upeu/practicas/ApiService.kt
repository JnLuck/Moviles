package com.upeu.practicas

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    fun getAllPersonas(@Url url:String):Response<Persona>

}