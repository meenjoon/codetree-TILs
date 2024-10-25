import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (year, month, day) = sc.nextLine().trim().split(" ").map { it.toInt() }

    print("${findSeason(year = year, month = month, day = day)}")
}

fun findSeason(
    year: Int,
    month: Int,
    day: Int,
): String {
    val isLeapYear = isLeapYear(
        year = year,
        month = month,
        day = day,
        )

    val isvalidDay = validDay(
        year = year,
        month = month,
        day = day,
        isLeapYear = isLeapYear
    )
    if(!isvalidDay) return "-1"

    when(month) {
        in 1..2 -> return "Winter"
        in 3..5 -> return "Spring"
        in 6..8 -> return "Summer"
        in 9..11 -> return "Fall"
        12 -> return "Winter"
        else -> return "-1"
    }
}

fun validDay(
    year: Int,
    month: Int,
    day: Int,
    isLeapYear: Boolean,
): Boolean {
    val map = mutableMapOf<Int, Int>()
    map[1] = 31
    map[3] = 31
    map[4] = 30
    map[5] = 31
    map[6] = 30
    map[7] = 31
    map[8] = 31
    map[9] = 30
    map[10] = 31
    map[11] = 30
    map[12] = 31

    if(isLeapYear) {
        map[2] = 29
    } else {
        map[2] = 28
    }

    val monthOfMaxDay = map.getOrDefault(month, -1)
    if(day > monthOfMaxDay) return false else return true
}

fun isLeapYear(
    year: Int,
    month: Int,
    day: Int,
): Boolean {
    if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
        return true
    } else if(year % 4 == 0 && year % 100 == 0) {
        return false
    } else if(year % 4 == 0) {
        return true
    } else {
        return false
    }
}