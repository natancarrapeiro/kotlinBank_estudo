package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.modelo.Endereco
import java.lang.IllegalStateException

fun recursosNUll() {
    val enderecoNull: Endereco? = null// ? indica que pode ser null
    val enderecoNullValido: Endereco? =
        Endereco(logradouro = "casa", bairro = "centro", complemento = "predio")// ? indica que pode ser null
//    endereco!!.logradouro//! ! não deixa ele ser null
//    val enderecoNaoNull:Endereco=enderecoNull!!
//    enderecoNaoNull.logradouro
    println(enderecoNull?.logradouro)//usando safe call ? ele verifica e retorna se ele for null ou não
    println(enderecoNullValido?.logradouro)//usando safe call ? ele verifica e retorna se ele for null ou não
    //usando o safe call você tem que garantir que o valor é null ou nao exemplo
    println(enderecoNullValido?.logradouro?.length?.toByte())//verifico que cada etapa é ou nao um null
    //let doc:https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/let.html
//    ao usar o let você consegue otimizar essa verificação de null
//    ele so vai excutar so caso não for null
    enderecoNullValido?.let { endereco: Endereco ->
//        it vem como apelido mas pode ser modificado
//        println(it.logradouro)
        println(endereco.logradouro)
        println(endereco.bairro)
        // utilizar nesse exemplo objeto de uma class que pode ser null (Endereço.complemento )
        // val tamanhoComplemento:Int = endereco.complemento?.length ?:0 //se ele for um nul retorna 0
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("comento é obrigatorio e esta vazio ")
        println("tamanhondo length do complemento é: $tamanhoComplemento")

    }
    println()
    println("enderecoNull")
    enderecoNull?.let { endereco: Endereco ->
//        it vem como apelido mas pode ser modificado
//        println(it.logradouro)
        println(endereco.logradouro)
        println(endereco.bairro)

    }
}