package br.com.alura.kotlin_bank.list

 fun filtrandoLista() {
    //    filtra pelo nome especifico
    livros.filter { it.autor == "Natan" }
        .sortedBy { it.anoPublicacao }
        .impimeMarcadores()
//    filtra pelo inicio da String
    livros.filter { it.autor.startsWith("Carr") }
        .sortedBy { it.anoPublicacao }
        .impimeMarcadores()
//    ele vai filtrar e pelo map vai mapear a lista e pegar so os titulos
    println("lista de livros que começa por N so exibindo o titulo")
    val titlosFiltrados: List<String> = livros.filter { it.autor.startsWith("N") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titlosFiltrados)
}