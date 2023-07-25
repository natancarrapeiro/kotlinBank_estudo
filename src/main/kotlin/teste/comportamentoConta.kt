package teste

import modelo.ContaCorrente
import modelo.ContaPolpanca

fun comportamentoConta() {
    val contaNatan = ContaCorrente("natan", 1000)


    val contaCarapeiro = ContaPolpanca("carrapeiro", 2000)



    contaNatan.minhaConta()
    contaNatan.depositar(50.0)
    contaNatan.sacar(25.0)
    contaNatan.transferir(contaCarapeiro, 10.0)
    contaCarapeiro.minhaConta()
}