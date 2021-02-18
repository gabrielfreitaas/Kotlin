package Exercicios

fun main () {
    println(imprimirNome("João"))

    calculaInvestimento(15, 10.0)

}

fun imprimirNome (nome: String): String{
    return "Olá $nome"
}

fun calculaInvestimento (quantidade: Int, precoAcao: Double){

    var total: Double
    total = quantidade * precoAcao
    println("O total do investimento foi de R$ $total")


}