package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException
import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*

//ctrl+alt+O limpa os imports não utilizado

fun main() {

    println("início main")
   // funcao1()
    testaContasDiferentes()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    }catch (e:SaldoInsuficienteException){
//        println(e.stackTrace)
//        println(e.message)
//        println(e.cause)
        e.printStackTrace()
        println("pegou o SaldoInsuficienteException")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

        for (i in 1..5) {
            println(i)

            throw SaldoInsuficienteException()
        }
    println("fim funcao2")
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


















