fun factoresPrimos(num: Int): Array<Int> {
    var n = num
    val factores = mutableListOf<Int>()
    var divisor = 2

    while (n > 1) {
        while (n % divisor == 0) {
            factores.add(divisor)
            n /= divisor
        }
        divisor++
    }

    return factores.toTypedArray()
}

fun main() {
    val numero = 465
    val resultado = factoresPrimos(numero)
    println("Los factores primos de $numero son: ${resultado.joinToString()}")
}
