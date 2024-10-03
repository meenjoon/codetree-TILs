import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }.toMutableList()

    for(i in 0..9) {
        if(i == 0) {
            print("${a[0]} ")
            continue
        } else if(i == 1) {
            print("${a[1]} ")
            continue
        }

        val result = a[i-1] + 2 * a[(i - 2)]
        a.add(result)

        print("$result ")
    }
}