package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.modelo.*

//ctrl+alt+O limpa os imports não utilizado

fun main() {
    // println("Bem vindo ao Kotlin Bank")
    // comportamentoConta()
    //testeFuncionario()
    //testaContasDiferentes()
   // autentica()
    //testaContasDiferentes()


    val natan = Cliente("natan", cpf = "123", Endereco(),senha=2)
    val contapopancaNatan=ContaPolpanca(natan,200)
    val contaCorrenteNatan=ContaCorrente(natan,200)
    println("Total de contas: ${totalContas}")

}



















