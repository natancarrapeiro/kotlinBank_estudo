package br.com.alura.kotlin_bank.modelo

class Endereco (
    val logradouro: String="",
    val numero:Int=0,
    val bairro:String="",
    val cidade:String="",
    val estado:String="",
    val cep :String="",
    val complemento:String=""

){
    //alt+ insert (toString) seleciona o que quer mostrar
    override fun toString(): String {
        return """
            |Endereco(logradouro='$logradouro',
            | numero=$numero,
            | bairro='$bairro', 
            | cidade='$cidade',
            | estado='$estado', 
            | cep='$cep', 
            | complemento='$complemento')
            | """.trimMargin()
    }
}