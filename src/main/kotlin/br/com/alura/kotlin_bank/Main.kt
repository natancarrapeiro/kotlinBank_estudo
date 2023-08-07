package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException
import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*

//ctrl+alt+O limpa os imports não utilizado

fun main() {
var enderecoNull:Endereco?=null// ? indica que pode ser null
var enderecoNullValido:Endereco?= Endereco(logradouro = "casa")// ? indica que pode ser null
//    endereco!!.logradouro//! ! não deixa ele ser null
//    val enderecoNaoNull:Endereco=enderecoNull!!
//    enderecoNaoNull.logradouro
    println(enderecoNull?.logradouro)//usando safe call ? ele verifica e retorna se ele for null ou não
    println(enderecoNullValido?.logradouro)//usando safe call ? ele verifica e retorna se ele for null ou não
    //usando o safe call você tem que garantir que o valor é null ou nao exemplo
    println(enderecoNullValido?.logradouro?.length?.toByte())//verifico que cada etapa é ou nao um null

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


















