package DeclaracaoVariaveis

fun main (){
    // Variaveis mutáveis
    var nome = "Gabriel"
    nome = "Kleber"
    val nome2 = "João"

    // Variavel imutavel
    val idade = 10

    // Só pode não inicializar o tipo de uma variavel com VAL, se declarado var, mensagem de erro
    val x: Int

    println(nome)
    println(idade)
    print("Olá $nome2 e bem vindo $nome")

}