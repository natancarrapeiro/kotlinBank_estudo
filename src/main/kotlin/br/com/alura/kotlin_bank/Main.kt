package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*

//ctrl+alt+O limpa os imports não utilizado

fun main() {






    // println("Bem vindo ao Kotlin Bank")
    // comportamentoConta()
    //testeFuncionario()
    //testaContasDiferentes()
   // autentica()
    //testaContasDiferentes()

/*
val objectException=object {
        val nome:String="natan"
        val cpf:String="123.123.123-25"
        val senha:Int=1000
      fun autentica(senha:Int)=this.senha==senha
   }
   println("nome do cliente ${objectException.nome}")
 */


    val natan = Cliente("natan", cpf = "123", Endereco(),senha=2)
    val contapopancaNatan=ContaPolpanca(natan,200)
    val contaCorrenteNatan=ContaCorrente(natan,200)
    println("Total de contas: ${Conta.totalDeContas}")

}



















