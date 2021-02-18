package ControleFluxo

fun main (){

    operacao(10,5,"Soma")
    operacao(10,5,"Subtração")



}

fun operacao (a: Int, b: Int, c:String): Int {

    when ( c ) {
        "Soma" -> {
            return a+b
        }
        "Subtração" -> {
            return a - b
        }
        else -> {
            println("Operação incorreta")
            return 0
        }
    }
}