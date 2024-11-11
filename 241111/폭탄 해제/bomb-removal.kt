import java.util.*
import kotlin.math.*

data class Dummy(
    val name: String,
    val value: Any,
) {
    override fun toString(): String {
        return "$name : $value"
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val (r, g, b) = sc.nextLine().trim().split(" ").let {
        Triple(it[0], it[1], it[2].toInt())
    }
    
    val dummy1 = Dummy(name = "code", value = r)
    val dummy2 = Dummy(name = "color", value = g)
    val dummy3 = Dummy(name = "second", value = b)

    println(dummy1)
    println(dummy2)
    println(dummy3)
}