import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    for(i in 1..a.size) {
        if(a[i-1] % 3 == 0) {
            print("${a[i-2]}")
            break
        }
    }
}