package br.com.alura.kotlin_bank.Array.funcaoArrays

import java.math.BigDecimal
import java.math.RoundingMode

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal? =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)//setScale coloca quantas casa depois dá,
//                                                                         RoundingMode.UP arendonda para cima
    }