package br.com.alura.kotlin_bank.exception

class SaldoInsuficienteException(
    mensagem: String = "saldo insuficiente",
) : Exception(mensagem)