package ControleFluxo

fun main() {
    maiorDeIdade(18)
    maiorDeIdade(12)
    maiorDeIdade(29)
    println("---------------------------------------------------------")

    println(calculaBonus("Gerente Junior", 1000f))

}

fun maiorDeIdade(idade: Int) {

    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}

fun calculaBonus(cargo: String, salario: Float): Float {

    val bonus: Float
    if (cargo.contains("Coordenador")) {
        bonus = salario * 0.2f
    } else if (cargo.contains("Gerente Junior")) {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }
    return bonus
}
