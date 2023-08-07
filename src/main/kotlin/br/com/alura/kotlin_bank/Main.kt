package br.com.alura.kotlin_bank

//ctrl+alt+O limpa os imports não utilizado

fun main() {

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





//arrays
//navegandoArray()
//ArrayforEach()
//alterandoArray()
//rengesArray()

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


















