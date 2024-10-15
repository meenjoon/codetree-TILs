import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    // var str = sc.nextLine()

    // while(true) {
    //     val n = sc.nextLine().toInt()

    //     if(str.length <= n) {
    //         str = str.slice(0..str.length-2)
    //     } else {
    //         str = str.slice(0..n-1) + str.slice(n+1..str.length-1)
    //     }

    //     println("$str")

    //     if(str.length == 1) {
    //         break
    //     }
    // }

    val sb = StringBuilder(sc.nextLine())
    
    while(true) {
        val n = sc.nextLine().toInt()

        if(sb.length <= n) {
            sb.delete(sb.length-1, sb.length)
        } else {
            sb.delete(n, n+1)
        }
        println("${sb.toString()}")

        if(sb.length == 1) {
            break
        }
    }
}