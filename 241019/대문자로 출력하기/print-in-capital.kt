import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(".")

    a.forEach { str ->
        str.forEach { char ->
            if(char.isLetter()) {
                if(97 <= char.code) {
                    print("${(char.code - 32).toChar()}")
                } else {
                    print("$char")
                }
            }
        }
    }
}