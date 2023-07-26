package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.modelo.Cliente
import br.com.alura.kotlin_bank.modelo.ContaCorrente

fun testeCopiasEReferencias() {
    val natan = Cliente("natan","12", senha = 2)
    val carrapeiro= Cliente("carrapeiro","", senha = 2)
    val contaJoao = ContaCorrente(natan,500)
    println(contaJoao)
    val contaMaria = ContaCorrente(carrapeiro,600)
    println(contaMaria)

}