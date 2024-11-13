import java.util.*
import kotlin.math.*

data class Dot(
    val x: Int,
    val y: Int,
    val distance: Int = -1,
    val index: Int,
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val list = List(n) {
        Dot(
            x = sc.nextInt(),
            y = sc.nextInt(),
            index = it + 1,
        )
    }

    val formattedList = list.map {
        it.copy(distance = abs(it.x) + abs(it.y))
    }

    // formattedList.sortedWith(compareBy<Dot> { it.distance } 
    //     .thenBy { it.index }
    // ).forEach {
    //     println(it.index)
    // }

    formattedList.sortedWith(compareBy( { it.distance }, { it.index } )
    ).forEach {
        println(it.index)
    }
}