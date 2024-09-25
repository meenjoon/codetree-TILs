import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val b = sc.nextInt()
    val a = sc.nextInt()

    for(i in b downTo a) {
        if(i % 2 == 1) {
            print("$i ")
        }
    }
}