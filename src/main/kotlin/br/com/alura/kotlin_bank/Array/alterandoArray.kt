package br.com.alura.kotlin_bank.Array

fun alterandoArray() {
    val salarios: DoubleArray = doubleArrayOf(1500.00, 2300.00, 5000.00, 3500.00)

    val aumento = 1.1
    var indece = 0

    for (salario in salarios) {
        salarios[indece] = salario * aumento

        indece++
    }
    println(salarios.contentToString())//contentToString() Retorna uma representação de string do conteúdo da matriz especificada como se fosse
    println()

    for (indece in salarios.indices) {
        salarios[indece] = salarios[indece] * aumento
    }
    println(salarios.contentToString())
    println()

    salarios.forEachIndexed() { i, salario -> //forEachIndexed()Executa a ação determinada em cada caractere, fornecendo índice sequencial com o caractere.
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}