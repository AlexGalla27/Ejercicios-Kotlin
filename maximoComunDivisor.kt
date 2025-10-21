fun mcd(a: Int, b: Int): Int{
    var num1 = a
    var num2 = b
    
    while (num2 != 0){
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

fun main(){
    val a = 56
    val b = 98
    println("El maximo comun divisor de $a y $b es : ${mcd(a, b)}")
}