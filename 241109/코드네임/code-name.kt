import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val list = mutableListOf<User>()
    repeat(5) {
        val(a, b) = sc.nextLine().trim().split(" ").let {
            Pair(it[0], it[1].toInt())
        }

        list.add(User(name = a, score = b))
    }

    list.minByOrNull{ it.score }.let { minUser ->
        print(minUser)
    }
}

data class User(
    val name: String,
    val score: Int,
) {
    override fun toString(): String {
        return "$name $score"
    }
}