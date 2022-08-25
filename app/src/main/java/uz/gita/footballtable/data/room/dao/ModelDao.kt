package uz.gita.footballtable.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import uz.gita.footballtable.data.room.enitity.ModelEntity


@Dao
interface ModelDao:BaseDao<ModelEntity> {


    @Query("Select * From model")
    fun getAllData():LiveData<List<ModelEntity>>

}