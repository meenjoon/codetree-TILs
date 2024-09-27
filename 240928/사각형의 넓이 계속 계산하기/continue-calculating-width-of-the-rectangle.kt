import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val width = sc.nextInt()
        val height = sc.nextInt()
        val str = sc.next()
        
        println("${width * height}")
        if(str == "C") {
            break
        }
    }
}