package ConversoesValores

import java.lang.NumberFormatException

fun main(){

    try {
        print("l".toInt())
    } catch (e: NumberFormatException){
        println("Esse valor não é válido")
    } catch (e: Exception  ){
        println("Algo de errado aconteceu")
    }
    finally {
        println("Teste finally")
        println("Teste finally")
    }


}