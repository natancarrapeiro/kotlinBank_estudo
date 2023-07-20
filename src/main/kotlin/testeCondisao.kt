fun testeCondisao(saldo: Double) {
    when {
        saldo > 0.0 -> println("seu saldo é positivo valor:R$ $saldo")
        saldo == 0.0 -> println("Sua conta não tem saldo no momento R$ $saldo")
        else -> println("Conta esta em debito R$ $saldo")
    }
}