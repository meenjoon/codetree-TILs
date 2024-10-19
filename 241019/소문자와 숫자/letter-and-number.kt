import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().filter { it.isLetter() || it.isDigit() }.map {
        if(it.isLetter() && it.code < 97) {
            (it.code + 32).toChar()
        } else {
            it
        }
    }

    print("${a.joinToString(separator = "")}")
}