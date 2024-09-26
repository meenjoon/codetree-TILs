import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    val b = sc.nextInt()

    print("$a ")

    for(i in a..b) {
        if(i % 2 == 1) {
            a *= 2 
        } else {
             a += 3 
        }

        if(a > b) {
            return
        }
        print("$a ")
    }
}