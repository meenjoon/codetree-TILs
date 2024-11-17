import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (m1, d1, m2, d2) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val first = (1..(m1-1)).map { monthToDay(it) }.sum() + d1
    val second = (1..(m2-1)).map { monthToDay(it) }.sum() + d2

    val isPositive = second > first

    val diffDay = abs(second - first)
    
    val rangeDay = diffDay % 7
    val secondDay = rangeToDay(
        range = rangeDay,
        isPositive = isPositive
    )
    println(secondDay)
}

fun monthToDay(month: Int): Int {
    return when(month) {
        1 -> 31
        2 -> 28
        3 -> 31
        4 -> 30
        5 -> 31
        6 -> 30
        7 -> 31
        8 -> 31
        9 -> 30
        10 -> 31
        11 -> 30
        12 -> 31
        else -> -9999
    }
}

fun rangeToDay(
    range: Int,
    isPositive: Boolean,
): String {
    if(isPositive) {
        return when(range) {
            0 -> "Mon"
            1 -> "Tue"
            2 -> "Wed"
            3 -> "Thu"
            4 -> "Fir"
            5 -> "Sat"
            6 -> "Sun"
            else -> ""
        }
    } else {
        return when(range) {
            0 -> "Mon"
            1 -> "Sun"
            2 -> "Sat"
            3 -> "Fri"
            4 -> "Thu"
            5 -> "Wed"
            6 -> "Tue"
            else -> ""
        }
    }

}