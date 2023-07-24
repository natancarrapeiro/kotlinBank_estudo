fun testaAtenticacao() {
    val gerente = Gerente(
        "natan_Carrapeiro",
        "123.123.123-12",
        5000.0,
        2012
    )

    val clienteMaria= Cliente(
        nome = "maria",
        cpf = "123.123.123-12",
        senha = 123
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 2012)
    sistema.entra(clienteMaria,13)
}