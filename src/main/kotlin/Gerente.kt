class Gerente(
    nome: String, cpf: String, salario: Double, val senha: Int,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun meuFuncionario() {
        this.nome
        this.cpf
        this.salario
        println("Nome do gerente $nome")
        println("CPF $cpf")
        println("Salario atual de R$ $salario reais")
        this.senha
        println("so pra mostra que tem como usar a msm função com pequenas alteração")
    }
    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else return false
    }

    override val bonificacao: Double = super.bonificacao +salario //property //super =class mae


}