package Exercicios.ControleFluxo
    // Crie uma função que recebe dois valores inteiros e imprima o maior deles. Considere que não serão informados
    // dois valores iguais


fun main (  ){

    imprimeValores(35,10)

}

fun imprimeValores ( valorUm: Int, valorDois: Int ){

    if ( valorUm > valorDois ){
        println("Valor Um maior que valor Dois")
    } else {
        println("Valor Dois maior que valor Um")
    }

}