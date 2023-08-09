package br.com.alura.kotlin_bank.Collections

fun exemprodeColecao() {
    val nomesInterable: Iterable<String> = setOf(
        "natan",
        "joão",
        "carrapeiro",
        "odair",
        "mika"
    )
    println(nomesInterable)
    println()

    val nomescollection: Collection<String> = listOf(
        "natan",
        "joão",
        "carrapeiro",
        "odair",
        "mika"
    )
    println(nomescollection)
    println()


    for (nome: String in nomesInterable.iterator()) {
        println(nome)
    }
}