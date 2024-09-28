import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    val star = "* "

    for(i in 1..n) {
        if(i % 2 == 1) {
            println("*")
        } else {
            println("${star.repeat(i)}")
        }
    }
}