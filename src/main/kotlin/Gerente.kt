class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
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

    override val bonificacao: Double =salario //property //super =class mae


}