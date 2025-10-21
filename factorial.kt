fun main() {
    val num = 3
    val fac = factorial(num)
    println("El factorial de $num es $fac.")
}

fun factorial(entero: Int): Int {
    var contador = 1
    var factorial = 1
    
    while(contador <= entero){
        factorial *= contador
        contador++
    }
    
    return factorial
}