package modelo

abstract class FuncionarioAdmin(
//abstract faz que a class ja fica com status de open
    //dados
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int,

    ) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel { //inseri uma interface
    //comportamento
    override fun autentica(senha: Int): Boolean {
        //println("autentica pelo funcionario admin")
        return if (this.senha == senha) {
            true
        } else false
    }

}