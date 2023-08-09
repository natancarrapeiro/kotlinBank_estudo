package br.com.alura.kotlin_bank

import br.com.alura.kotlin_bank.Collections.testedeColections

//ctrl+alt+O limpa os imports não utilizado


fun main() {
//    chamo a class BancoDeNomes e coloco ela na variavel banco
    val banco = BancoDeNomes()
    banco.salva("carrapeiro")
    println(banco.nomes)

    /* crio uma copia do msm banco mas ele pode
     ser alterado usadno por exemplo MutableCollection deixando fragil  */
//    val nomesSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String>
//    nomesSalvos.add("natan")
//    apos o .toList
    val nomesSalvos: Collection<String> = banco.nomes
    println(nomesSalvos)


}

class BancoDeNomes {
    //    para resolver o problema de copia  basta colocar no que ta sendo devolvido um .toList
    val nomes: Collection<String> get() = Companion.dadosNome.toList()
//    coloquei uma visualização da lista mas não a alteração

    fun salva(nome: String) {
        Companion.dadosNome.add(nome)
    }

    //    https://kotlinlang.org/docs/object-declarations.html#companion-objects
    companion object {
        //    criei uma lista que pode ser alterada mais em estado privado
        private val dadosNome = mutableListOf<String>()
    }
}


//colection
//exemprodeColecao()
//testedeColections()

//lista
//removeAdicionaLista()
//oredenandoLista()
//filtrandoLista()
//testeLivrosNUll()
//testaDaPrateleira()

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


















