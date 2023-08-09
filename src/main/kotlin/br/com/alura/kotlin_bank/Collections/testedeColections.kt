package br.com.alura.kotlin_bank.Collections

fun testedeColections() {
    //    lista que nao pode ser mudada
    val nomelist: List<String> = listOf(
        "natan",
        "joão",
        "carrapeiro",
        "odair",
        "mika"
    )
    //    lista que pode ser mudada
    val nomeMutableLits: MutableList<String> = mutableListOf(
        "natan",
        "joão",
        "carrapeiro",
        "odair",
        "mika"
    )
//    nomelist.add()
    nomeMutableLits.add("aceita")
    nomeMutableLits.remove("odair")
//    nomelist.remuve()
    println(nomelist)
    println()
}
