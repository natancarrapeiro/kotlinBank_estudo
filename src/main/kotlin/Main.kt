fun main() {
    println("Bem vindo ao Kotlin Bank")
    //comportamentoConta()
    val natan=Funcionario(
        nome = "natan_Carrapeiro",
        cpf = "121.241.145-24",
        salario = 2000.0
    )
//    natan.meuFuncionario()
//   println( natan.bonificacao())
    val carrapeGerente=Gerente("natanGerente","212.212.212-21",4000.0,1220)
    carrapeGerente.meuFuncionario()
}












