package OrientacaoObjetos

class Pessoa(val anosNascimento: Int, var NomeCompleto: String) {
    var olhos: String = ""
    fun dormir() {

    }

    fun acordar() {

    }

}

fun main() {
    // class - comportamentos e atributos

    // class(I
    //instancia) objetos
    var pessoa: Pessoa = Pessoa(2005, "Talisson vitorino")
    println(pessoa.NomeCompleto)
    pessoa.NomeCompleto
    pessoa.dormir()
    pessoa.acordar()
    pessoa.olhos = "verdes"

}