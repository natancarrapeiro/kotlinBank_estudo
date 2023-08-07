package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.Array.ArrayforEach
import br.com.alura.kotlin_bank.Array.alterandoArray
import br.com.alura.kotlin_bank.Array.navegandoArray
import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException
import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*
import java.lang.IllegalStateException

//ctrl+alt+O limpa os imports não utilizado

fun main() {

    //doc https://kotlinlang.org/docs/basic-syntax.html#ranges
    val sequencia:IntRange = 1.rangeTo(10)
    for (s in sequencia){
        println("$s")
    }
    println()

   val numeroPares: IntProgression = 0..100 step 2
    for (numeropar in numeroPares){
        println("$numeropar")
    }
    println()

    var numerosDecrescentePar: IntProgression =100 downTo 0 step 2
    numerosDecrescentePar.forEach {
        println("$it")
    }
    println()

    val intervalo: ClosedFloatingPointRange<Double> = 1500.0..5000.0
    val salario=35000.0
    if (salario in intervalo){
        println("O salario esta entre o intervalo ")
    }else{
        println("não salario esta entre o intervalo ")
    }

    val alfabeto: ClosedRange<String> ="a".."z"
    val letra="k"
    println(letra in alfabeto)

}



//arrays
//navegandoArray()
//ArrayforEach()
//alterandoArray()

// println("Bem vindo ao Kotlin Bank")
// comportamentoConta()
//testeFuncionario()
//testaContasDiferentes()
// autentica()
//testaContasDiferentes()
//recursosNUll()

/*
 object declarations e companion object
companion object Contador{
        var totalDeContas=0
            private set
    }
*/


















