package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.modelo.Cliente
import br.com.alura.kotlin_bank.modelo.ContaCorrente
import br.com.alura.kotlin_bank.modelo.ContaPolpanca
import br.com.alura.kotlin_bank.modelo.Endereco
import br.com.alura.kotlin_bank.teste.testaContasDiferentes

//ctrl+alt+O limpa os imports não utilizado
var totalContas=0
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



















