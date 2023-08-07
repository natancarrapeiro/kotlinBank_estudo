package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException
import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*

//ctrl+alt+O limpa os imports não utilizado

fun main() {
var enderecoNull:Endereco?=null// ? indica que pode ser null
//    endereco!!.logradouro//! ! não deixa ele ser null
    val enderecoNaoNull:Endereco=enderecoNull!!
    enderecoNaoNull.logradouro
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


















