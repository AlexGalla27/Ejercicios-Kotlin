fun mcd(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    
    return num1
}

fun mcm(a: Int, b: Int): Int {
    return Math.abs(a * b) / mcd(a, b)
}

fun main() {
    val a = 12
    val b = 18
    println("El mínimo común múltiplo de $a y $b es: ${mcm(a, b)}")
}
