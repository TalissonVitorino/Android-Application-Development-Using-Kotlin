@file:Suppress("GrazieInspection", "GrazieInspection", "GrazieInspection", "GrazieInspection")

package soltos/*
Escreva um programa para ser usado na portaria de um evento
peça a idade Menores de idade nao podem ser permitidos entrar. Mensagem: "Negado. Menores de idade
nao sao permitidos entrar."

Peça o tipo de convite os tipos de convites sao comon de luxo negar a entada casa nao seja
nenhum destes Mensagem Negado convite invalido

peça o code do convite premium e luxo começam com Xl convites comuns
 com XT caso o condigo nao esteja nos padrões, negar entrada Mensagem: "Negado convite Inválido."

 Caso todos os criterios sejam satisfeitos exibir: "welcome"
 */

fun main() {
    print("digite sua idade: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Menores de idade não são permitidos entrar.")
            return
        }
    }

    print("Qual é o tipo do convite? ")
    var tipo = readLine()
    if (tipo != null && tipo != "") {
        tipo = tipo.lowercase()
        if (tipo == "comum" || tipo == "luxo" || tipo == "primium"){
            println("Qual o codigo do convite? ")
            var codigo = readLine()
            if (codigo != null && codigo != "") {
                codigo = codigo.lowercase()
                if (tipo == "comum" && codigo.startsWith("xt")){
                    println("Seja bem, vido na pisa!! ")
                }else if (tipo == "luxo" || tipo == "primium"&& codigo.startsWith("xl")){
                    println("Bem vido, na sua area vip! ")
                }else{
                    println("convite invalido!!")
                }
            }
        }else{
            println("Negado convite invalido")
            return
        }
    }
}


