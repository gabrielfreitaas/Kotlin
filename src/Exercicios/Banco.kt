package Exercicios

import java.util.*

fun main (  ){

    inserirSaldo(500f, 200f)

}

fun inserirSaldo (saldo: Float, valorSaque: Float){

    println(saldo)

    if ( saldo < valorSaque ){
        println("Saldo insuficiente para efetuar o saque")
    } else{
        println("Saque realizado com sucesso")
    }

}

