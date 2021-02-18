package ControleFluxo

fun main (){

    println(calculaBonus2("Gerente Junior", 2500f))

}

fun calculaBonus2 (cargo: String, salario: Float): Float {

    return if ( cargo == "Coordenador" ){
        salario * 0.2f
    } else if ( cargo == "Gerente Junior" ){
        salario * 0.5f
    } else {
        salario * 2
    }
}