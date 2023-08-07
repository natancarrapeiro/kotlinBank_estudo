package br.com.alura.kotlin_bank.Array

fun ArrayforEach() {
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