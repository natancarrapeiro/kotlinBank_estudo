package teste

import modelo.ContaCorrente
import modelo.ContaPolpanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "natan", numeroConta = 1000)
    val contaPolpanca = ContaPolpanca(titular = "alberto", numeroConta = 1001)

    contaCorrente.depositar(200.0)
    contaPolpanca.depositar(200.0)

    contaCorrente.sacar(100.0)
    contaPolpanca.sacar(100.0)

    contaCorrente.transferir(contaDestino = contaPolpanca, valorDeTranferencia = 50.0)
    contaPolpanca.minhaConta()
    contaCorrente.minhaConta()
}