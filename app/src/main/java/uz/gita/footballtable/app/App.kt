package uz.gita.footballtable.app

import android.app.Application
import androidx.viewbinding.BuildConfig
import timber.log.Timber
import uz.gita.footballtable.data.room.database.AppDatabase

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        AppDatabase.init(this)
    }
}