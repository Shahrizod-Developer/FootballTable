package uz.gita.footballtable.data.response

data class Data(
    val abbreviation: String,
    val desc: String,
    val name: String,
    val seasons: List<Season>
)