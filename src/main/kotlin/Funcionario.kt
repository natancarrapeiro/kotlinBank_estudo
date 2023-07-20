import kotlin.time.times

class Funcionario(
    //dados
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    //comportamento
    fun meuFuncionario(){
        this.nome
        this.cpf
        this.salario
        println("Nome do funcionario $nome")
        println("CPF $cpf")
        println("Salario atual de R$ $salario reais")
    }

    fun bonificacao(): Double {
        return salario * 0.1
    }


}