import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    var resultBoolean = false
    
    for(i in a..b) {
        if(i % c == 0) {
            resultBoolean = true
            break
        }
    }
    
    if(resultBoolean) print("YES") else print("NO")
}