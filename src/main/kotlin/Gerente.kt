class Gerente(
    nome: String, cpf: String, salrio: Double, val senha: Int,
) : Funcionario(nome = nome, cpf = cpf, salario = salrio) {
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

    override val bonificacao: Double = super.bonificacao +salrio //property //super =class mae


}