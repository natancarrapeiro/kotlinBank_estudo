class Diretor(
    nome: String, cpf: String, salario: Double, val senha: Int,plr:Double//participação do lucro
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {


    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else return false
    }

    override val bonificacao: Double = super.bonificacao + salario +plr//property //super =class mae



}