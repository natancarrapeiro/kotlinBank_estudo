package br.com.alura.kotlin_bank.list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val edotora: String? = null,
)


