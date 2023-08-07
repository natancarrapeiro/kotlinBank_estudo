package br.com.alura.kotlin_bank

import java.math.BigDecimal
import java.math.RoundingMode

//ctrl+alt+O limpa os imports não utilizado

fun main() {
//        Array<vc pode cria o seu tipo de Array>
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }//inicia como zero
//    salarios[0]="1500.55".toBigDecimal()//é usado string pra evitar problema de arrendodamento do Double
//    salarios[1]="2000.04".toBigDecimal()
    val salarios = bigDecimalArrayOf("2300.0","2500.00","5000.00","6000.00")

    println(salarios.contentToString())
    val aumento="1.1".toBigDecimal()
//    map le tudo e retorna uma nova lista
    val salarioComAumento = salarios.map {
        salario ->
        if(salario<"5000.00".toBigDecimal()){
            salario+"500".toBigDecimal()
        }else{
            (salario * aumento).setScale(2,RoundingMode.UP)//setScale coloca quantas casa depois da ,
//                                                                         RoundingMode.UP arendonda pra cima
        }
    }.toTypedArray()//eu altero a saida de uma lisat para uma Array

    println(salarioComAumento.contentToString())

}
fun bigDecimalArrayOf(vararg valores:String ):Array<BigDecimal> {//(vararg)vc pode passar varias variaveis
   return Array<BigDecimal>(valores.size){i ->
        valores[i].toBigDecimal()
    }
}



//arrays
//navegandoArray()
//ArrayforEach()
//alterandoArray()
//rengesArray()
//operacaoDentroArray()


// println("Bem vindo ao Kotlin Bank")
// comportamentoConta()
//testeFuncionario()
//testaContasDiferentes()
// autentica()
//testaContasDiferentes()
//recursosNUll()

/*
 object declarations e companion object
companion object Contador{
        var totalDeContas=0
            private set
    }
*/


















