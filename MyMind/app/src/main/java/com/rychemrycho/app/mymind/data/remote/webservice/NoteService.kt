package com.rychemrycho.app.mymind.data.remote.webservice

import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface NoteService {
    @GET("")
    fun fetchNotes(@Query("apiKey") apiKey: String): Observable
}