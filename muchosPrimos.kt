fun main(){
    val lista = mutableListOf<Int>(2);
    val num = 11
    var contador = 3
    while (lista.count() < num){
        val esPrimo = primo(contador)
        if(esPrimo) {
            lista.add(contador)
        }
        contador += 2
    }
    for(value in lista){
        println(value)
    }
}

fun primo(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}