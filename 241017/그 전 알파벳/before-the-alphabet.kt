import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    if(a[0].code -1 < 97) {
        print('z')
    } else {
        print("${(a[0].code - 1).toChar()}")
    }
}