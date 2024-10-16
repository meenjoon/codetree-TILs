import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val sb = StringBuilder(sc.next())

    val findIndex = sb.indexOf("e")
    sb.delete(findIndex, findIndex + 1)

    print("${sb.toString()}")
}