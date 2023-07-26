package br.com.alura.kotlin_bank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco=Endereco(),
    internal val senha: Int,
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return if (this.senha == senha) {
            true
        } else false
    }
    }
