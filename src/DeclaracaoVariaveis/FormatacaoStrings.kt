package DeclaracaoVariaveis

fun main (){

    val frase = "Kotlin é uma linguagem de programação"
    val caracteristica = " show ! "

    val quebraTexto = """Três aspas
        |quebra o texto
        |até selecionando backspace no paragrado
        |   conta as os espaços
    """.trimMargin()

    println(frase + caracteristica)
    println("Kotlin é uma linguagem $caracteristica")
    println("----------------------------")
    println(quebraTexto)


}