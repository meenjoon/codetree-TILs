import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()

    a.forEach{ value ->
        list.add(value)
    }

    for(i in 0..9) {
        if(i == 0 || i == 1) {
            print("${list[i]} ")
            continue
        }

        val result = (list[i - 2] + list[i - 1]) % 10
        print("$result ")

        list.add(result)
    }
}