package br.com.alura.kotlin_bank.list

fun oredenandoLista() {
    ////    usando Livro():Comparable
    val ordenacaoAnoDePublicacao: List<Livro> =
        livros.sorted()//antes de chama eu fiz a lista de Livros ter um sub tipo Comparable
    ordenacaoAnoDePublicacao.impimeMarcadores()
    println()
////    usando sem Comrable
    val ordenadoPorTitulo: List<Livro> = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.impimeMarcadores()
    println()
    val ordenadoPorAutores: List<Livro> = livros.sortedBy { it.autor }
    ordenadoPorAutores.impimeMarcadores()
}