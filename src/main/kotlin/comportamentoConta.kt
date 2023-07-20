fun comportamentoConta() {
    val contaNatan = Conta("natan", 1000)


    val contaCarapeiro = Conta("carrapeiro", 2000)



    contaNatan.minhaConta()
    contaNatan.depositar(50.0)
    contaNatan.sacar(25.0)
    contaNatan.transferir(contaCarapeiro, 10.0)
    contaCarapeiro.minhaConta()
}