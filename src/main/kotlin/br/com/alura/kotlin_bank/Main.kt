package br.com.alura.kotlin_bank

import java.math.BigDecimal
import java.math.RoundingMode

//ctrl+alt+O limpa os imports não utilizado

fun main() {
//        Array<vc pode cria o seu tipo de Array>
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }//inicia como zero
//    salarios[0]="1500.55".toBigDecimal()//é usado string pra evitar problema de arrendodamento do Double
//    salarios[1]="2000.04".toBigDecimal()
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("2300.0", "2500.00", "5000.00", "6000.00")

    println(salarios.contentToString())
    val aumento: BigDecimal = "1.1".toBigDecimal()
//    map le tudo e retorna uma nova lista
    val salarioComAumento: Array<BigDecimal?> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()//eu altero a saida de uma lisat para uma Array

    println(salarioComAumento.contentToString())

    val gastoInicial: BigDecimal? = salarioComAumento.somatoria()
    println(gastoInicial)

    val meses: BigDecimal =6.toBigDecimal()
    val gastoTotal: BigDecimal? = salarioComAumento.fold(gastoInicial) { aculador, salario ->
        (salario?.times(meses))?.setScale(2, RoundingMode.UP)?.let { aculador?.plus(it) }
    }
    println("gasto total apos 6 meses $gastoTotal")

    println(intArrayOf(1, 2, 3).sum())


}


fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal? =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)//setScale coloca quantas casa depois dá,
//                                                                         RoundingMode.UP arendonda para cima
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {//(vararg)vc pode passar varias variaveis
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal?>.somatoria(): BigDecimal? {
   return this.reduce { acumulador, valor ->// reduce Acumula o valor começando com o primeiro elemento e aplicando a operação da esquerda para a direita ao valor atual do acumulador e a cada elemento.
       acumulador?.plus(valor!!)
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


















