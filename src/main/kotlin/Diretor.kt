class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double,//participação do lucro
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override fun meuFuncionario() {
        this.nome
        this.cpf
        this.salario
        println("Nome do Diretor $nome")
        println("CPF $cpf")
        println("Salario atual de R$ $salario reais")
        this.senha
        println("so pra mostra que tem como usar a msm função com pequenas alteração")
    }

    override val bonificacao: Double = salario + plr//property //super =class mae

}