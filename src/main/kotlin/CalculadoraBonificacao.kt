class CalculadoraBonificacao {
    private var total: Double =0.0
    fun resgistra(funcionario: Funcionario) {  //tecnica de polimorfismo
        this.total += funcionario.bonificacao
    }
//    }fun resgistra(gerente: Gerente){
//        this.total += gerente.bonificacao
//    }fun resgistra(diretor: Diretor){
//        this.total += diretor.bonificacao
//    }
    fun qualMeuTotal(){
        println("seu total de bonificação é ${total}")
    }
}