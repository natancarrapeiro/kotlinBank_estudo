class Analista(
    nome: String, cpf: String, salario: Double,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun meuFuncionario() {
        this.nome
        this.cpf
        this.salario
        println("Nome do gerente $nome")
        println("CPF $cpf")
        println("Salario atual de R$ $salario reais")

    }


    override val bonificacao: Double = super.bonificacao + salario *0.1 //property //super =class mae


}