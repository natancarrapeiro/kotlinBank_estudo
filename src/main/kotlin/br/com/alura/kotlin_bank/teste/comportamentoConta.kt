package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.modelo.Cliente
import br.com.alura.kotlin_bank.modelo.ContaCorrente
import br.com.alura.kotlin_bank.modelo.ContaPolpanca

fun comportamentoConta() {
    val natan =Cliente("natan","12", senha = 2)
    val carrapeiro=Cliente("carrapeiro","", senha = 2)
    val contaNatan = ContaCorrente(natan, 1000)


    val contaCarapeiro = ContaPolpanca(carrapeiro, 2000)



    contaNatan.minhaConta()
    contaNatan.depositar(50.0)
    contaNatan.sacar(25.0)
    contaNatan.transferir(contaDestino = contaCarapeiro, 10.0, senha = 2)
    contaCarapeiro.minhaConta()
}