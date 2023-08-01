package br.com.alura.kotlin_bank.exception

class FalhaAutenticacaoException (
    mensagem:String="falha na autenticacão"
):Exception(mensagem)