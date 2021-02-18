package DeclaracaoVariaveis

fun main (){

    val a = 10
    val b = 20
    val c = 1

    println(imprimirNome("João"))

    calculaBonus(a,b,c)
}

fun calculaBonus ( num1: Int, num2: Int, num3:  Int ){

    println("O bônus foi de : R$ ${num1 + num2 * num3 }")
}

fun imprimirNome (nome: String) : String {
    return "Olá, $nome"
}