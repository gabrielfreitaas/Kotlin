package Exercicios.ControleFluxo
    /* Lutadores de box são classificados em categorias de acordo com o peso. Escreva um programa usando o
    * comando When que receba a descrição da categoria e informe o intervalo de peso no println
    *
    * Pena: menos de 57kg
    * Leve: Mais de 57kg e menos de 61kg
    * Médio: Mais de 61kg e menos de 73kg
    * Pesado: Igual ou acima de 73kg
    * */


fun main () {

    lutadores(51, "Pena")

}

fun lutadores (peso: Int, categoria: String){

    when ( categoria ){
        "Pena" -> {
            if ( peso < 57 ){
                println("Peso pena")
            }
        }
        "Leve" -> {
            if ( peso >= 57 && peso < 61 ){
                println("Peso Leve")
            }
        }
        "Médio" ->{
            if ( peso >= 61 && peso < 73 ){
                println("Peso Médio")
            }
        }
        "Pesado" ->{
            if ( peso >=73 ){
                println("Peso pesado")
            }
        }
    }

}