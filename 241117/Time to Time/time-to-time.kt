import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var (hour, min, hour2, min2) = sc.nextLine().trim().split(" ").map { it.toInt() }

    var elapsedMin = 0
    while(true) {
        if(hour == hour2 && min == min2) {
            break
        }

        elapsedMin++
        min++
        if(min == 60) {
            min = 0
            hour++
        }
    }

    println("$elapsedMin")
}