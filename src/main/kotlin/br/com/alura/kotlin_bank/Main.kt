package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException
import br.com.alura.kotlin_bank.modelo.*
import br.com.alura.kotlin_bank.teste.*
import java.lang.IllegalStateException

//ctrl+alt+O limpa os imports não utilizado

fun main() {
    val idade1 = 23
    val idade2 = 22
    val idade3 = 35

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3) {
        idade2
    } else {
        idade3
    }
    println(maiorIdade)
    println()

    val idades = IntArray(size = 5)//tamanho do array 4
    idades[0] = 25 //[posisao 0,1,2,3]
    idades[1] = 22
    idades[2] = 26
    idades[3] = 45
    idades[4] = 32
    var maiorIdadeArray = 0
    for (idade in idades) {
        if (idade > maiorIdadeArray) {
            maiorIdadeArray = idade
        }
    }
    println(maiorIdadeArray)

    println()
    var maiorIdadeArrayOf = 0
    val idadesArrayOf: IntArray = intArrayOf(26, 24, 35, 36, 37, 42)
    for (idade in idadesArrayOf) {
        if (idade > maiorIdadeArrayOf) {
            maiorIdadeArrayOf = idade
        }
    }
    println(maiorIdadeArrayOf)
    println()
    var menorIdade = Int.MAX_VALUE//para garantir que vai pega o maior valor possivel com um int
    idadesArrayOf.forEach { idadesArrayOf ->
        if (idadesArrayOf < menorIdade) {
            menorIdade = idadesArrayOf
        }
    }
    println(menorIdade)


}


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


















