package br.com.alura.kotlin_bank.teste

import br.com.alura.kotlin_bank.modelo.*


    public fun testaObjects() {
        val objectException = object {
            val nome: String = "natan"
            val cpf: String = "123.123.123-25"
            val senha: Int = 1000
            fun autentica(senha: Int) = this.senha == senha
        }
        println("nome do cliente ${objectException.nome}")


        val natan = Cliente("natan", cpf = "123", Endereco(), senha = 2)
        val contapopancaNatan = ContaPolpanca(natan, 200)
        val contaCorrenteNatan = ContaCorrente(natan, 200)
        println("Total de contas: ${Conta.totalDeContas}")
    }
