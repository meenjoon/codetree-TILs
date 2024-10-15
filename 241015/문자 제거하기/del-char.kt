import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    var sb = StringBuilder(sc.nextLine())

    while(true) {
        val n = sc.nextLine().toInt()


        if(sb.length <= n) {
            if(sb.length == 2) {
                sb.delete(1, 2)
            } else {
                sb.delete(sb.length-2, sb.length-1)
            }
        } else {
            sb.delete(n, n+1)
        }
        
        println("${sb.toString()}")

        if(sb.length == 1) {
            break
        }
    }
}