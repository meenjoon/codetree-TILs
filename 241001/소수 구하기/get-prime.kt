import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for(i in 2..n) {

        var isPrime = true
        for(j in 2..i-1) {
            if(i % j == 0) {
                isPrime = false
            }
        }
        
        if(isPrime) {
            print("$i ")
        }
    }
}