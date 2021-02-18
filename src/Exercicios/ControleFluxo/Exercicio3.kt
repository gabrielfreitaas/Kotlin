package Exercicios.ControleFluxo
/* Considere que um abacaxi custa 3 reais quando comprados em quantidade menor que 10
* Se for comprado 10 ou mais abacaxis, o valor vai para 2 reais unidade.
* Escreva uma função capaz de receber a quantidade de abacaxis comprados e o valor total de compra
* */



fun main() {
    comprarAbacaxi("Abacaxi", 20)

}

fun comprarAbacaxi(fruta: String, quantidade: Int) {

    if (quantidade < 10) {
        println("Quando comprado menor que 10 $fruta, valor de R$3,00")
        println("Comprados $quantidade $fruta, o valor total foi: ${quantidade * 3}")
    } else if (quantidade >= 10) {
        println("Quando comprado 10 ou mais $fruta valor de R$2,00")
        println("Comprados $quantidade $fruta, o valor total foi: ${quantidade * 2}")
    }

}