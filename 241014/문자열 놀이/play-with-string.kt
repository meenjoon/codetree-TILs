import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val s = sc.next()
    val q = sc.nextInt()
    
    sc.nextLine()

    val sb = StringBuilder(s)
    repeat(q) {
        val (a, b, c) = sc.nextLine().trim().split(" ")

        if(a == "1") {
            val valueB = sb[b.toInt() - 1]
            val valueC = sb[c.toInt() - 1]

            sb.set(b.toInt() - 1, valueC)
            sb.set(c.toInt() - 1, valueB)
            println("${sb.toString()}")
        } else if(a == "2") {
            val valueB = b[0]
            val valueC = c[0]

            for(i in 0..sb.length-1) {
                if(sb[i] == valueB) {
                    sb.set(i, valueC)
                }
            }
            println("${sb.toString()}")
            
            // println("${sb.toString().replace(b,c)}")
        }
    }
}