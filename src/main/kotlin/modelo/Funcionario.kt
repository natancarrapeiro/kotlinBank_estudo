package modelo

abstract  class Funcionario(//abstract faz que a class ja fica com status de open
    //dados
    val nome: String,
    val cpf: String,
    val salario: Double,

) {
    //comportamento
    open fun meuFuncionario() {
        this.nome
        this.cpf
        this.salario
        println("Nome do funcionario $nome")
        println("CPF $cpf")
        println("Salario atual de R$ $salario reais")
    }

    abstract val bonificacao:Double// o fato de ser um val abstract faz que as class que pegar a class funcionario seja obrigada a implementar a sua propia bonificaçao

}