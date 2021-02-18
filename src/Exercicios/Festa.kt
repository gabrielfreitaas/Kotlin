package Exercicios

fun main () {

    informaIdade(25)
}

fun informaIdade ( idade: Int ) {

    if ( idade <= 12 ){
        println("Festa proibida para crianças")
    } else if ( idade >= 12 && idade < 18 ){
        println("Pode entrar, mas na área de adolescentes")
    } else if ( idade >= 18 ){
        println("Acesso a todas as áreas")
    }

}