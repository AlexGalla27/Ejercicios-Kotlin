fun factoresPrimos(num: Int): List<Int> {
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

    return factores
}

fun main() {
    val numero = 465
    println("Los factores primos de $numero son: ${factoresPrimos(numero)}")
}

