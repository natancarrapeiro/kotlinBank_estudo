package br.com.alura.kotlin_bank.modelo

import br.com.alura.kotlin_bank.modelo.Autenticavel

class SistemaInterno {
    fun entra(admin: Autenticavel, senha:Int){//agora pelo interface a gente presisa so de um funcionario pra funcionar
        if(admin.autentica(senha)){
            println("bem vindo ao bytebank Admin")
        }else{
            println("Falha na autenticação")
        }

    }

}
