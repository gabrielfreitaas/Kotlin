package Parametros

fun main (){

    media3(10f,8f,6f)
    media(10f, "João",5000)

}

fun media3 ( vararg notas: Float){

    if ( notas.isEmpty() ){
        var soma = 0f
        for ( nota in notas ){
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }
}

fun <T> media ( vararg valores: T){
    for ( valor in valores ){
        println(valor)
    }
}