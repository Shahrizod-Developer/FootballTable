package uz.gita.footballtable.data.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.gita.footballtable.data.room.dao.ModelDao
import uz.gita.footballtable.data.room.enitity.ModelEntity


@Database(
    entities = [ModelEntity::class],
    version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun dao(): ModelDao

    companion object {
        private var appDatabase: AppDatabase? = null

        fun init(context: Context) {
            appDatabase =
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "football"
                )
                    .allowMainThreadQueries()
                    .build()
        }

        fun getInstance() = appDatabase!!
    }

}