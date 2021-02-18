package Parametros

fun main (){

    endereco(rua = "Avenida Paulista", cep = "000000-00", estado = "São Paulo", cidade = "São Paulo")

}

fun endereco (rua: String = "", cidade:String, estado:String, cep:String, numero:Int = 0){
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")

}