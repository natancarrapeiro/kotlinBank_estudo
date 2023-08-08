package br.com.alura.kotlin_bank.Array

import br.com.alura.kotlin_bank.Array.funcaoArrays.bigDecimalArrayOf
import br.com.alura.kotlin_bank.Array.funcaoArrays.calculaAumentoRelativo
import br.com.alura.kotlin_bank.Array.funcaoArrays.media
import br.com.alura.kotlin_bank.Array.funcaoArrays.somatoria
import java.math.BigDecimal
import java.math.RoundingMode
fun testeArray(){

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

//println(intArrayOf(1, 2, 3).sum())
    val salariosOrdenados: List<BigDecimal?> = salarioComAumento.sortedByDescending {it}
//ordenação de Array doc https://www.techiedelight.com/pt/sort-array-in-decreasing-order-in-kotlin/
    println(salariosOrdenados)

    val maiores3salarios: Array<BigDecimal?> =salariosOrdenados.take(3)
        .toTypedArray()
    val mediaSalarios: BigDecimal? =maiores3salarios.media()
    println(mediaSalarios)
}