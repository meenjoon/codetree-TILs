import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (m1, d1, m2, d2) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val day = sc.next()

    val firstTotalDay = (1..(m1-1)).map { monthToDay(it) }.sum() + d1
    val secondTotalDay = (1..(m2-1)).map { monthToDay(it) }.sum() + d2

    val isPositive = secondTotalDay > firstTotalDay

    val diffDay = abs(firstTotalDay - secondTotalDay)

    val divideDay = diffDay / 7
    val modDay = diffDay % 7
    val includeDay = if(includeDay(modDay = modDay, compareDay = day, isPositive = isPositive)) 1 else 0
    
    if(isPositive) {
        println("${divideDay + includeDay}")
    } else if(secondTotalDay == firstTotalDay) {
        if(day == "Mon") {
            print("1")
        } else {
            print("0")
        }
    } else {
        print("0")
    }
}

fun monthToDay(month: Int): Int {
    return when(month) {
        1 -> 31
        2 -> 29
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
        else -> 99999
    }
}

fun includeDay(
    modDay: Int,
    compareDay: String,
    isPositive: Boolean,
): Boolean {
    val dayList = if(isPositive) {
        listOf("Mon", "Tue", "Wed", "Thu", "Fir", "Sat", "Sun")
    } else {
        listOf("Mon", "Sun", "Sat", "Fir", "Thu", "Wed", "Tue")
    }
    val day = dayList[modDay]
    val modIndex = dayList.indexOf(day)
    val compareIndex = dayList.indexOf(compareDay)

    return modIndex >= compareIndex
}