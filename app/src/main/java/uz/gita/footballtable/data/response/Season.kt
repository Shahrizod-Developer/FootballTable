package uz.gita.footballtable.data.response

import uz.gita.footballtable.data.response.Type

data class Season(
    val displayName: String,
    val endDate: String,
    val startDate: String,
    val types: List<Type>,
    val year: Int
)