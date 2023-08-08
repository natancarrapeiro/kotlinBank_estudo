package br.com.alura.kotlin_bank.list

fun List<Livro?>.impimeMarcadores() {
    val textoExibidoModificado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "- ${it.titulo} autor/autora: ${it.autor}\n ano: ${it.anoPublicacao}"
    }
    println("### Lista de Livros ###\n $textoExibidoModificado")
}