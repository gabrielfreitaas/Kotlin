package Exercicios.ControleFluxo

fun main (){

    informaDoisValores(25f,50f)
}

fun informaDoisValores ( valorUm: Float, valorDois: Float ){

    if ( valorUm == valorDois ){
        println("Valores iguais")
    } else {
        println("Valores diferentes")
    }

}