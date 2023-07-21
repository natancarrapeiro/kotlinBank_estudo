open class Funcionario(
    //dados
    val nome: String,
    val cpf: String,
    val salario: Double,
    //0 gargo comum/ 1 vendedor/2 gerente
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

    open val bonificacao:Double = salario * 0.1
}