package soltos

fun main() {
    println("Digite a descrição do produto, calcular um por vez: ")
    val descricao = readln()
    print("Digite o preço unitário do produto: ")
    val precoUnitario = readln().toDouble()
    println("digite a quantidade ")
    val quantidadeAdquirida = readln().toDouble()
    val precoFinal = calculaValorFinal(precoUnitario, quantidadeAdquirida)

    println("Descricao: $descricao")
    println("Valor total final é: $precoFinal")
}

fun calculaValorFinal(precoUnitario: Double, quantidadeAdquirida: Double): Double {

    val valorTotal = quantidadeAdquirida * precoUnitario
    val percDesconto: Double = when {
        quantidadeAdquirida <= 5 -> 2.0
        quantidadeAdquirida <= 10 -> 3.0
        else -> 5.0
    }

    val valorDesconto = valorTotal * percDesconto / 100
    val valorTotalFinal = valorTotal - valorDesconto

    return valorTotalFinal
}