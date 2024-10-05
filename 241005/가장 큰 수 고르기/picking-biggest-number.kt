import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    var maxNum = 0

    a.forEach { value ->
        if(value > maxNum) {
            maxNum = value
        }
    }

    print("$maxNum")
}