class SistemaInterno {
    fun entra(admin: FuncionarioAdmin,senha:Int){
        if(admin.autentica(senha)){
            println("bem vindo ao bytebank Admin")
        }else{
            println("Falha na autenticação")
        }

    }
}