import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeatStar(n = n)
}

fun repeatStar(n: Int) {
    if(n == 0) {
        return
    }

    repeatStar(n - 1)
    
    println("HelloWorld")
}