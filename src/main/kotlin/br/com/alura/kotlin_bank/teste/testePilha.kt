package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    }catch (e: SaldoInsuficienteException){
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