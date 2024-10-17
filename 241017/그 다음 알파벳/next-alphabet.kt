import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    
    if(a[0].code + 1 >= 122) {
        print("a")
    } else {
        print("${(a[0].code + 1).toChar()}")
    }
}