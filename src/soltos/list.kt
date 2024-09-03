package soltos

fun main() {
    val list = mutableListOf(
        "Maria", "julia",
        "jaziel", "fernanda", "Marcia", "carol", "jaque", "nando", "Mateus"
    )

    println(list.size)

    for (x in list) {
        println(x)
    }

    println("---------------------------------------------------")

    list.removeIf { it.startsWith('M') }

    println(list.size)

    for (x in list) {
        println(x)
    }
}
