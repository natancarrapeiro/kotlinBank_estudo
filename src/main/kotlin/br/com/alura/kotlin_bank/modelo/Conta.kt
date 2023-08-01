package br.com.alura.kotlin_bank.modelo

import br.com.alura.kotlin_bank.exception.FalhaAutenticacaoException
import br.com.alura.kotlin_bank.exception.SaldoInsuficienteException


//class
abstract class Conta(
    internal val titular: Cliente,
    private val numeroConta: Int, // = Random.nextInt(1,1000),
):Autenticavel {
    protected var saldo: Double = 0.0

    companion object Contador {
        var totalDeContas = 0
            private set
    }

    init {
        println("Criando conta")
        totalDeContas++
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

    internal fun transferir(contaDestino: Conta, valorDeTranferencia: Double,senha:Int) {
        if (saldo < valorDeTranferencia) {
            throw SaldoInsuficienteException(
                mensagem = "Saldo insuficiente," +
                        " saldo atual: $saldo ;" +
                        " valor de trasferencia $valorDeTranferencia "
            )
        }
        if (!autentica(senha)){
            throw  FalhaAutenticacaoException()
        }


        this.saldo -= valorDeTranferencia
        contaDestino.depositar(valorDeTranferencia)
        println("transferencia relizada com sucesso ")
        println(
            "Valor transferido da conta ${this.titular} no valor  " +
                    "de R$$valorDeTranferencia para conta de ${contaDestino.titular}"
        )

    }

    override fun autentica(senha: Int): Boolean {
       return titular.autentica(senha)//delegando a outra class
    }

}