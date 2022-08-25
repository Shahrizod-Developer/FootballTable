package uz.gita.footballtable.data.response

import androidx.room.Entity


data class Model(
    val abbr: String,
    val id: String,
    val logos: Logos,
    val name: String,
    val slug: String
)