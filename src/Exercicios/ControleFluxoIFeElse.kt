package ControleFluxo

fun main (){

    media(10,5,6,7)
    media(2,6,5,3)
}

fun media (num1: Int, num2: Int, num3: Int, num4:Int) {
    println("Nota 1: " + num1)
    println("Nota 2: " + num2)
    println("Nota 3: " + num3)
    println("Nota 4: " + num4)
    println("-----------------------------------------------")

    val calculaMedia: Int = (num1 + num2 + num3 + num4) / 4
    println(calculaMedia)
}