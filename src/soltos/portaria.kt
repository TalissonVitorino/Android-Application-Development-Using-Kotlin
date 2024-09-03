package soltos


fun main() {
   portaria()
}

fun portaria() {
    println("Qual é sua idade? ")
    val idade = readlnOrNull()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos")
            return
        }
    }
    print("Qual é o tipo de convite? ")
    var tipoConvite =readlnOrNull()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido. ")
            return
        }
        println("qual é o código do convite?")
        var code = readlnOrNull()

        if (code != null && code != "") {
            code = code.lowercase()

            if (tipoConvite == "comum" && code.startsWith("xt")) {
                println("Welcome :) ")
            } else {
                if (tipoConvite == "premium" || tipoConvite == "luxo" && code.startsWith("xt")) {
                    println("welcome :) ")
                } else {
                    println("Convite negado! ")
                }
            }
        }
    }
}