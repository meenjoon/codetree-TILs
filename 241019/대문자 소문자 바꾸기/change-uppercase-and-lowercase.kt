import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next().filter{ it.isLetter() }.map {
        // 대문자 판별
        if(it.code < 97) {
            (it.code + 32).toChar()
        } else { // 소문자 판별
            (it.code - 32).toChar()
        }
    }.joinToString("")

    print("$a")
}