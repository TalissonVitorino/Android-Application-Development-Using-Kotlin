package pacote
fun main() {
    try {
        return
        val s : String? = null
        println(s!!.length)

        val a = 10/0
    }catch (e : NullPointerException){
        println("variavel nula!")
    }catch (e : ArithmeticException){
        println("Impossível dividir por zero!")
    }finally {
        println("Finallly")
    }
    println("fim")

}