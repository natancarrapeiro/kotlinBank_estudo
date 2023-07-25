package br.com.alura.kotlin_bank.modelo

import br.com.alura.kotlin_bank.modelo.Conta

class ContaPolpanca(titular: String, numeroConta: Int) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valorDeSaque: Double) {
        if (this.saldo>= valorDeSaque){
            this.saldo -= valorDeSaque
        }
    }


}