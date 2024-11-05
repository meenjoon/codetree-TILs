import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a,b,c) = sc.nextLine().trim().split(" ")
    val dummy = Dummy(
        name = a,
        str = b,
        num = c.toInt(),
    )

    println("secret code : ${dummy.name}")
    println("meeting point : ${dummy.str}")
    println("time : ${dummy.num}")
}

data class Dummy(
    val name: String,
    val str: String,
    val num: Int,
)