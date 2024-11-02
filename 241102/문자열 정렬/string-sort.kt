import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().toCharArray()

    print(a.sorted().joinToString(separator = ""))
}