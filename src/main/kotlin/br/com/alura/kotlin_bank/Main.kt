package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.list.*

//ctrl+alt+O limpa os imports não utilizado


fun main() {

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


//lista
//removeAdicionaLista()
//oredenandoLista()
//filtrandoLista()

//arrays
//navegandoArray()
//ArrayforEach()
//alterandoArray()
//rengesArray()
//operacaoDentroArray()
//testaArray()


// println("Bem vindo ao Kotlin Bank")
// comportamentoConta()
//testeFuncionario()
//testaContasDiferentes()
// autentica()
//testaContasDiferentes()
//recursosNUll()

/*
 object declarations e companion object
companion object Contador{
        var totalDeContas=0
            private set
    }
*/


















