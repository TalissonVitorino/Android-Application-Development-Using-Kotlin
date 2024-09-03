package pacote

fun main() {
    for (i in 1..50) {
        if (i % 5 != 0) {
            continue
        }
        print("$i ")
    }
}
