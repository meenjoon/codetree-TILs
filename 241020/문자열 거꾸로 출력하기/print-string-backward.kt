import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val a = sc.next()
        
        if(a == "END") {
            break
        }

        println("${a.reversed()}")
    }
}