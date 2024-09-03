package soltos

fun main() {
    val str: String? = null
    if (str != null) {
        str.lowercase()
        str.length
    }
    //corpo só é executado se o rst for diferente de nulo
    // scope function = passa a validar sua variável como IT

    str?.let {
        it.lowercase()
        it.length
    }
}