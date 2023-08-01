package br.com.alura.kotlin_bank.teste
fun testeException(entrada: String) {
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na coversão")
        e.printStackTrace()
        null
    }
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido:$valorComTaxa")
    } else {
        println("valor invalido")
    }
}