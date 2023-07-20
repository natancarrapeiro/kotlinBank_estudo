fun testeLoops() {
    var i = 0
    val titular = "natan $i"
    val numberConta: Int = 1000 + i
    var saldo = i + 100
    println("ola ${titular} sua conta é $numberConta  seu saldo é $saldo")
    println()

    while (i < 5) {
        val titular = "natan $i"
        val numberConta: Int = 1000 + i
        val saldo = i + 100
        println("ola ${titular} sua conta é $numberConta  seu saldo é $saldo")
        println()
        i++
    }

    for (i: Int in 2..15 step 2) {
        if (i == 8) {
            continue
        }
        if (i == 12) {
            break
        }
    }
}