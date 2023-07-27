package br.com.alura.kotlin_bank.modelo

import br.com.alura.kotlin_bank.totalContas

//class
abstract class Conta(
    internal val titular: Cliente,
    private val numeroConta: Int, // = Random.nextInt(1,1000),
) {
    protected var saldo: Double = 0.0


    init {
        println("Criando conta")
        totalContas++
    }
    //getters e setter no kotlin
    //private set
    //get() = field

    internal fun minhaConta() {
        println(this.titular)
        println(this.numeroConta)
        println(this.saldo)
    }

    internal fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Deposito de $valor")
            println("saldo da conta atual ${this.saldo}")
        }
    }

    abstract fun sacar(valor: Double)

    internal fun transferir(contaDestino: Conta, valorDeTranferencia: Double): Boolean {
        return if (this.saldo > valorDeTranferencia) {
            this.saldo -= valorDeTranferencia

            contaDestino.depositar(valorDeTranferencia)
            println("transferencia relizada com sucesso ")
            println("Valor transferido da conta ${this.titular} no valor  de R$$valorDeTranferencia para conta de ${contaDestino.titular}")
            true
        } else {
            println("valor de tranferencia maior do que saldo atual da conta: ${this.titular}")
            false
        }
    }

}