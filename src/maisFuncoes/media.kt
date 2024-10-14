package maisFuncoes

fun main (){
   println(media(1f,2f,3f,5.76f,8f))
}

fun media(vararg notas: Float): Float {
    var soma = 0f
    for (nota in notas) {
        soma += nota

    }
    return (soma/notas.size)}
