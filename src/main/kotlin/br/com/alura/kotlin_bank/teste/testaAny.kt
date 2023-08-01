package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "casa",
        bairro = "dourado",
        cidade = "Guapirama",
        estado = "parana",
        cep = "1234-5",
        complemento = "sitio"

    )
    val enderecoNovo = Endereco(cep = "1234-56")



    println(endereco.toString())
//    println(enderecoNovo.toString())//toString trazer uma representação textual de uma instância de um objeto

    println(endereco.hashCode())

//    println(enderecoNovo.hashCode())//ANY.hashCode serve como id/rg de um objeto
    println(endereco == enderecoNovo) //Any.equals serve pra comparação

    fun imprime(valor: Any): Any {
        println(valor)
        return valor
    }
    imprime(enderecoNovo.toString())
}