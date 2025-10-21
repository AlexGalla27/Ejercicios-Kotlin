fun primo(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main(){
    val num = 11
    val esPrimo = primo(num)
    if(esPrimo){
        println("El número $num es primo")
    } else {
        println("El número $num no es primo")
    }
    
}
