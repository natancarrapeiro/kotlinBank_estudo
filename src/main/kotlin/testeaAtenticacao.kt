fun testaAtenticacao() {
    val gerente = Diretor(
        "natan_Carrapeiro",
        "123.123.123-12",
        5000.0,
        2012,
        233.0
    )

    val clienteMaria= Cliente(
        nome = "maria",
        cpf = "123.123.123-12",
        senha = 123
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 2012)
    sistema.entra(clienteMaria,123)
}