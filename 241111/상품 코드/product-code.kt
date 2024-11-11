import java.util.*
import kotlin.math.*

data class Product(
    val name: String = "codetree",
    val code: Int = 50,
) {
    override fun toString(): String {
        return "product $code is $name"
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val (a,b) = sc.nextLine().trim().split(" ").let {
        Pair(it[0], it[1].toInt())
    }

    val defaultProduct = Product()
    val dummyProduct = Product(name = a, code = b)

    println(defaultProduct)
    println(dummyProduct)
}