package br.com.alura.kotlin_bank.list

fun testaDaPrateleira() {
    val prateleira = PrateleiraDeLivros(genero = "literatura", livros = livros)

    val ordemPublicacao = prateleira.ordemDePublicacao()
    ordemPublicacao.impimeMarcadores()
    val oredenadoporAutores = prateleira.ordemPorAutor()
    println()
    oredenadoporAutores.impimeMarcadores()
}