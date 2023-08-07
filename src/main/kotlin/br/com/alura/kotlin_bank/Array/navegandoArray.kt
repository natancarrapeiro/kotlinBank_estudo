package br.com.alura.kotlin_bank.Array

fun navegandoArray() {
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
}