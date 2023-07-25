package modelo

import modelo.Funcionario

class Auxiliar(
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


    override val bonificacao: Double = salario *0.05 //property //super =class mae


}