package DeclaracaoVariaveis

fun main (){

    println(calculaDoisNumeros(10, 20))

    println(concatenaNomes("João", "Zezinho"))
}

fun calculaDoisNumeros (a: Int, b:Int) = a + b
fun concatenaNomes ( nome1: String, nome2: String ) = "Dois nomes, $nome1 e $nome2"