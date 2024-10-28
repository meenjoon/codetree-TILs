import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    ascNum(n = n)
    println()
    descNum(n = n)
}

fun ascNum(n: Int) {
    if(n == 0) {
        return
    }

    ascNum(n = n - 1)
    print("$n ")
}

fun descNum(n: Int) {
    if(n == 0) {
        return
    }
    print("$n ")
    descNum(n = n - 1)
    println("")
}