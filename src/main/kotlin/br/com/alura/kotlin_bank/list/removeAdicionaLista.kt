package br.com.alura.kotlin_bank.list

fun removeAdicionaLista() {
    livros.add(
        Livro(
            titulo = "minha vida",
            autor = "Natan",
            anoPublicacao = 2023,
            editora = "minha"
        )
    )
    livros.impimeMarcadores()
    livros.remove(livro2)
    println()
    livros.impimeMarcadores()
}