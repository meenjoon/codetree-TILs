import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().reversed()

    a.forEachIndexed{ index, value ->
        if(index % 2 == 0) {
            print("$value")
        }
    }
}