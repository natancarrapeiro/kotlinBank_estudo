package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.modelo.Cliente
import br.com.alura.kotlin_bank.modelo.ContaCorrente
import br.com.alura.kotlin_bank.modelo.ContaPolpanca
import br.com.alura.kotlin_bank.modelo.Endereco

fun testaContasDiferentes() {
    val natan = Cliente(nome = "natan", cpf = "12",senha=2, endereco = Endereco(logradouro = "rua guadalajara",))
    val carrapeiro= Cliente(nome = "carrapeiro", cpf = "", senha = 2, endereco = Endereco(logradouro = "rua guadalajara",))
    val contaCorrente = ContaCorrente(titular = natan, numeroConta = 1000)
    val contaPolpanca = ContaPolpanca(titular = carrapeiro, numeroConta = 1001)

    contaCorrente.depositar(200.0)
    contaPolpanca.depositar(200.0)

    contaCorrente.sacar(100.0)
    contaPolpanca.sacar(100.0)

    contaCorrente.transferir(contaDestino = contaPolpanca, valorDeTranferencia = 50.0)
    contaPolpanca.minhaConta()
    contaCorrente.minhaConta()

    println("titular")
    println("nome do titular:  ${contaCorrente.titular.nome}")
    println("cpf do titular:  ${contaCorrente.titular.cpf}")
    println("senha do titular:  ${contaCorrente.titular.senha}")
    println("Endereço(logadourao) do titular:${contaCorrente.titular.endereco.logradouro} ")

}