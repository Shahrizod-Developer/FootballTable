package uz.gita.footballtable.data.room.enitity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "logos")
data class LogosEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val dark: String,
    val light: String
)