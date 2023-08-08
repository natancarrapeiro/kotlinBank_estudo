package br.com.alura.kotlin_bank.Array.funcaoArrays

import java.math.BigDecimal

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
fun  Array<BigDecimal?>.media(): BigDecimal? {
    return if (this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria()?.div(this.size.toBigDecimal())
    }
}