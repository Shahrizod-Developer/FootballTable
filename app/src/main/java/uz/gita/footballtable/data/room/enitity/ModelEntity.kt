package uz.gita.footballtable.data.room.enitity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.gita.footballtable.data.response.Logos


@Entity(tableName = "model")
data class ModelEntity(
    val abbr: String,
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @Embedded
    val logos: Logos,
    val name: String,
    val slug: String
)