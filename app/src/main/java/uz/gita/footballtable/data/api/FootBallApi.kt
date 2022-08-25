package uz.gita.footballtable.data.api

import android.telecom.Call
import androidx.lifecycle.LiveData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import uz.gita.footballtable.data.response.ResponseData
import uz.gita.footballtable.data.room.dao.ModelDao

interface FootBallApi {

    @GET("/leagues")
    fun getAllLeagues(): Response<ResponseData<List<ModelDao>>>

    @GET("/leagues/{id}")
    fun getAllLeagueDetail(@Path("id") leagueId: String): Response<ResponseData<ModelDao>>
}