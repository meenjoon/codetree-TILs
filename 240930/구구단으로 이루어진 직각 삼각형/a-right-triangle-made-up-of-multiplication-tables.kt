import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    for(i in 1..5) {
        val jMaxNum = n - i + 1
        for(j in 1..jMaxNum) {
            print("$i * $j = ${i * j}${if(j != jMaxNum) " / " else ""}")
        }
        println("")
    }
}