import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var isPrimeNum = true

    for(i in 2.. n-1) {
        if(n % i == 0) {
            isPrimeNum = false
            break
        }
    }

    if(isPrimeNum) print("P") else print("C")

}