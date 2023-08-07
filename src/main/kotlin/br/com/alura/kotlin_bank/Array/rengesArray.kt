package br.com.alura.kotlin_bank.Array

fun rengesArray() {
    //doc https://kotlinlang.org/docs/basic-syntax.html#ranges
    val sequencia: IntRange = 1.rangeTo(10)
    for (s in sequencia) {
        println("$s")
    }
    println()

    val numeroPares: IntProgression = 0..100 step 2
    for (numeropar in numeroPares) {
        println("$numeropar")
    }
    println()

    var numerosDecrescentePar: IntProgression = 100 downTo 0 step 2
    numerosDecrescentePar.forEach {
        println("$it")
    }
    println()

    val intervalo: ClosedFloatingPointRange<Double> = 1500.0..5000.0
    val salario = 35000.0
    if (salario in intervalo) {
        println("O salario esta entre o intervalo ")
    } else {
        println("não salario esta entre o intervalo ")
    }

    val alfabeto: ClosedRange<String> = "a".."z"
    val letra = "k"
    println(letra in alfabeto)
}