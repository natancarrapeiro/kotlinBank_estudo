abstract class FuncionarioAdmin(
//abstract faz que a class ja fica com status de open
    //dados
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,

    ) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    //comportamento

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else return false
    }
}