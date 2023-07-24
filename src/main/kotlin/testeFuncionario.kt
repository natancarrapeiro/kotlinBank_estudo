fun testeFuncionario() {
    //funcionario
    val natan = Analista(
        nome = "natan_Carrapeiro",
        cpf = "121.241.145-24",
        salario = 2000.0
    )
//
    natan.meuFuncionario()
    println(natan.bonificacao)
    println()
    //gerente
    val carrapeGerente = Gerente(
        "natanGerente",
        "212.212.212-21",
        4000.0,
        1220
    )
    carrapeGerente.meuFuncionario()
    println()
    //diretor
    val albertoDiretor = Diretor(
        nome = "alberto",
        cpf = "147.147.147-14",
        salario = 8000.0,
        senha = 2023,
        plr = 200.0
    )
    albertoDiretor.meuFuncionario()
    println(albertoDiretor.bonificacao)
    println()
//     calculadora
    var calcula = CalculadoraBonificacao()
    calcula.resgistra(natan)
    calcula.resgistra(carrapeGerente)
    calcula.resgistra(albertoDiretor)
    calcula.qualMeuTotal()
}