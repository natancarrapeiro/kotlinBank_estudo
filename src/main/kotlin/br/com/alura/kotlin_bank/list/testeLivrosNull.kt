package br.com.alura.kotlin_bank.list

fun testeLivrosNUll(){
    livrosNull.impimeMarcadores()

    livrosNull
        .groupBy { it?.editora ?: "editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro?>) ->
            println(
                "editora $editora: titulo${
                    livros.joinToString {
                        it?.titulo ?: ""
                    }
                }")
        }

}