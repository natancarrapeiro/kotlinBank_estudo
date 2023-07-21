class Diretor(
    nome: String, cpf: String, salrio: Double, val senha: Int,
) : Funcionario(nome = nome, cpf = cpf, salario = salrio) {


    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else return false
    }

    override val bonificacao: Double = salario * 0.25//property



}