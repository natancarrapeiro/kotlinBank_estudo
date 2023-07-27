package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*

//ctrl+alt+O limpa os imports não utilizado

fun main() {

    val endereco = Endereco(
        logradouro = "casa",
        bairro = "dourado",
        cidade = "Guapirama",
        estado = "parana",
        cep = "4s45",
        complemento = "sitio"

    )
    val enderecoNovo = Endereco()



   println(endereco.toString())
//    println(enderecoNovo.toString())//toString trazer uma representação textual de uma instância de um objeto

//    println(endereco.hashCode())
//    println(enderecoNovo.hashCode())//ANY.hashCode serve como ID/rg de um objeto

//    println(endereco.equals(endereco)) //Any.equals serve pra comparação

    fun imprime(valor: Any): Any {
        println(valor)
        return valor
    }
}



// println("Bem vindo ao Kotlin Bank")
// comportamentoConta()
//testeFuncionario()
//testaContasDiferentes()
// autentica()
//testaContasDiferentes()

/*
 object declarations e companion object
companion object Contador{
        var totalDeContas=0
            private set
    }
*/


















