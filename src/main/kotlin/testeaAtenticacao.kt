fun testaAtenticacao() {
    val gerente = Gerente(
        "natan_Carrapeiro",
        "123.123.123-12",
        5000.0,
        2012
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 2012)
}