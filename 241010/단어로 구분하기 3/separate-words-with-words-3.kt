import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    sc.nextLine().trim().split(" ").reversed().forEachIndexed { _, value ->
        println("$value")
    }
}