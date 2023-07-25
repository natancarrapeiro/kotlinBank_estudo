package br.com.alura.kotlin_bank.modelo

import br.com.alura.kotlin_bank.modelo.Funcionario

class CalculadoraBonificacao {
    private var total: Double = 0.0
    fun resgistra(funcionario: Funcionario) {  //tecnica de polimorfismo
        println("nome dos funcionarios ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

    fun qualMeuTotal() {
        println("seu total de bonificação é ${total}")
    }
}