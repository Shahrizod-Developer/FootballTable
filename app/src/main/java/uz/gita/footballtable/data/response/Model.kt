package uz.gita.footballtable.data.response

data class Model(
    val abbr: String,
    val id: String,
    val logos: Logos,
    val name: String,
    val slug: String
)