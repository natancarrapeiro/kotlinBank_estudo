package br.com.alura.kotlin_bank.list

val livro1 = Livro(
    titulo = "Grande Sertão: Veredas",
    autor = "João Guimarães Rosa",
    anoPublicacao = 1956,
)
val livro2 = Livro(
    titulo = "Minha vida de menina",
    autor = "Helena Morley",
    anoPublicacao = 1942,
    editora ="editora A"
)
val livro3 = Livro(
    titulo = "Memórias Póstumas de Brás Cubas",
    autor = "Machado de Assis",
    anoPublicacao =1881,
)
val livro4 = Livro(
    titulo = "Iracema",
    autor = "José de Alencar",
    anoPublicacao =1865,
    editora ="editora B"
)

val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

fun MutableList<Livro>.impimeMarcadores(){
    val textoExibidoModificado = this.joinToString(separator = "\n") {
        "- ${it.titulo} autor/autora: ${it.autor}"
    }
    println("### Lista de Livros ###\n $textoExibidoModificado")
}