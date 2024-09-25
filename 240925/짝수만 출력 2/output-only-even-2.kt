import java.util.*
import kotlin.math.*

fun main() {
    var sc = Scanner(System.`in`)

    var a = sc.nextInt()
    val b = sc.nextInt()

    while(a >= b) {
        if(a % 2 == 0){
            print("$a ")
        }
        a--
    }
}