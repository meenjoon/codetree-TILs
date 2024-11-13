import java.util.*
import kotlin.math.*

data class Person(
    val name: String,
    val height: Int,
    val weight: Int,
) {
    override fun toString(): String {
        return "$name $height $weight"
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val list = List(n) { 
        Person(
            name = sc.next(),
            height = sc.nextInt(),
            weight = sc.nextInt(),
        )
    }

    // list.sortedWith(compareBy<Person> { it.height }
    //     .thenByDescending { it.weight }
    // ).forEach {
    //     println(it)
    // }

    list.sortedWith(compareBy({ it.height }, { -it.weight })
    ).forEach {
        println(it)
    }
}