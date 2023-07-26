package br.com.alura.kotlin_bank.modelo

import br.com.alura.kotlin_bank.modelo.Conta

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int,
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo>= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}