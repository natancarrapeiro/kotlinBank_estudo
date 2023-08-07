package br.com.alura.kotlin_bank.Array

fun operacaoDentroArray() {
    val idade: IntArray = intArrayOf(20, 22, 15, 34, 13, 46)
    var maiorIdade = idade.max()//maior
    println(maiorIdade)
    println()

    val menorIdade = idade.min()//menor
    println(maiorIdade)
    println()

    val mediaIdade = idade.average()//media
    println(maiorIdade)
    println()

    val maioresDeIdaade = idade.all { it >= 18 }//vejo se todos atende a condição
    println("maiores de idaded $maioresDeIdaade")
    println()

    var existeAlunoMenorDeIdade = idade.any { it < 18 }//aumenos um (OR)
    println("existe aluno menor de idade $existeAlunoMenorDeIdade")
    println()

    val menoresDeIdadeNaoAltorisado = idade.filter { it < 18 }//filtrar
    println("quais a idade dos menores $menoresDeIdadeNaoAltorisado")
    println()

    val busca = idade.find { it >= 20 }//procuara de um dado expecifico
    println("buca se tem a idade $busca")
}