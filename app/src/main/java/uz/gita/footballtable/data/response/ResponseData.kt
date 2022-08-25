package uz.gita.footballtable.data.response

data class ResponseData<T>(
    val status: Boolean,
    val data: T
)