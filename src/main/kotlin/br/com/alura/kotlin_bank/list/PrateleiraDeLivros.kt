package br.com.alura.kotlin_bank.list

data class PrateleiraDeLivros(
    val genero: String,
    val livros: List<Livro>,//list é imutavel
//    val livros:MutableList<Livro>
// ao usar MutableList<> vc usa o msm obj e em casos pode alterar lugares onde vc nao deseja

) {
    fun ordemPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
//
//        val livrosOrdenados = livros.sortedBy { it.autor }
//        return livrosOrdenados
    }

    fun ordemDePublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

}