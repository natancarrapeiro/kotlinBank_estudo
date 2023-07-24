class Cliente (val nome:String,val cpf:String,val senha:Int)
    :Autenticavel{
    //agora vc é obrigado a ter a implementação
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else return false
    }

}