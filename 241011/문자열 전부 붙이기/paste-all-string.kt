import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    var result = ""
    repeat(n) {
        result += sc.nextLine()
    }

    print(result)
}