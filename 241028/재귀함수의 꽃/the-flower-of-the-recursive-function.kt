import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    printNum(n = n)
}

fun printNum(n: Int) {
    if(n == 0) {
        return
    }

    print("$n ")
    printNum(n-1)
    print("$n ")
}