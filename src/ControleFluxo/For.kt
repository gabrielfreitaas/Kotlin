package ControleFluxo

fun main (){

    acresceDezEmDez()
    print("")
    adicionaUm()
    diminuiDezEmDez()
}

fun acresceDezEmDez (){

    for ( i in 0..200 step 10 ){
        print("$i ")
    }
}

fun adicionaUm (){

    for ( i in 0..50 ){
        println("$i ")
    }
}

fun diminuiDezEmDez (){

    for ( j in 100 downTo -100 ){
        println("$j ")
    }
}








