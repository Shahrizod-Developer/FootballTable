package uz.gita.footballtable.data.server

import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.gita.footballtable.app.App


object RetrofitInstance {

    val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val client = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .addInterceptor(ChuckerInterceptor.Builder((App.instance)).build())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api-football-standings.azharimm.site")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()


}