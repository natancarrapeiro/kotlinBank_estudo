class ContaCorrente(titular: String, numeroConta: Int) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.sacar(valorComTaxa)
    }
}