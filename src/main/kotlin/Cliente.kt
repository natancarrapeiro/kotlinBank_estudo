class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int,
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return if (this.senha == senha) {
            true
        } else false
    }
    }
