import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.nextLine()
    val b = sc.nextLine()

    val sb = StringBuilder(a)

    while(true) {
        val findIndex = sb.indexOf(b)

        if(findIndex != -1) {
            sb.delete(findIndex, findIndex + b.length)
        } else {
            break
        }
    }

    println("${sb.toString()}")
}