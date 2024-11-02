import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }
    val b = sc.nextLine().trim().split(" ").map { it.toInt() }

    if(a.sorted() == b.sorted()) {
        print("Yes")
    } else {
        print("No")
    }
}