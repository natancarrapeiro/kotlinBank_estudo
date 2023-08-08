package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.list.Livro
import br.com.alura.kotlin_bank.list.impimeMarcadores
import br.com.alura.kotlin_bank.list.livro2
import br.com.alura.kotlin_bank.list.livros

//ctrl+alt+O limpa os imports não utilizado


fun main() {

    livros.add(
        Livro(
            titulo = "minha vida",
            autor = "natan",
            anoPublicacao = 2023,
            editora = "minha"
        )
    )
    livros.impimeMarcadores()
    livros.remove(livro2)
    println()
    livros.impimeMarcadores()
    println()
//    usando Livro():Comparable
    val ordenacaoAnoDePublicacao: List<Livro> =
        livros.sorted()//antes de chama eu fiz a lista de Livros ter um sub tipo Comparable
    ordenacaoAnoDePublicacao.impimeMarcadores()
    println()
//    usando sem Comrable
    val ordenadoPorTitulo: List<Livro> = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.impimeMarcadores()
    println()
    val ordenadoPorAutores = livros.sortedBy { it.autor }
    ordenadoPorAutores.impimeMarcadores()


}

//lista


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


















