package br.com.alura.kotlin_bank.list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null,
):Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
       return  this.anoPublicacao.compareTo(other.anoPublicacao)
//                      compara esse livro  (com esse )
    }
}


