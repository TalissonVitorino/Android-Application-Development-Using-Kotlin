package soltos

fun main() {
    println(spacing("oi , tudo bem?", isUpperCase = true))
}
fun spacing(str: String, isUpperCase: Boolean = false): String {
    val sb = StringBuilder()

    for (c in str) sb.append("$c")

    val r = sb.toString()

    return if (isUpperCase) r.uppercase() else r
}