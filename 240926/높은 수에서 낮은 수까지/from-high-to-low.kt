import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    if(a >= b) {
        for(i in a downTo b) {
            print("$i ")
        }
    } else {
        for(i in b downTo a) {
            print("$i ")
        }
    }
}