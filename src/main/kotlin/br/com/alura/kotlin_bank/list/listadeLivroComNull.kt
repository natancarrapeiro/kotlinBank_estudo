package br.com.alura.kotlin_bank.list

val livrosNull: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956,
    ),
    null,

    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881,
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "editora B"
    ),
    Livro(
        titulo = "To em casa",
        autor = "Natan",
        anoPublicacao = 2000,
        editora = "editora B"
    ),
    null,
    Livro(
        titulo = "Sai dai",
        autor = "Natan",
        anoPublicacao = 2002,
        editora = "editora B"
    ),
    Livro(
        titulo = "Android",
        autor = "Carrapeiro",
        anoPublicacao = 1854,
        editora = "editora B"
    ),
    null,
    Livro(
        titulo = "kotlin",
        autor = "Carrapeiro",
        anoPublicacao = 2000,
        editora = "editora B"
    )
)