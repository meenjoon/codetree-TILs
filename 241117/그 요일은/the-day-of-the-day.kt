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
    
    if(isPositive) { // second 가 더 큰 경우
        println("${divideDay + includeDay}")
    } else if(secondTotalDay == firstTotalDay) { // first와 second 같은 경우
        if(day == "Mon") { // first와 second 같은 경우에서, 비교 day 가 mon 이면 1 출력
            print("1")
        } else { // first와 second 같은 경우에서, 비교 day 가 mon 이 아닐 경우 0 출력
            print("0")
        }
    } else { // 그 외(first가 더 큰 경우) 0 출력
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
    modDayNum: Int,
    compareDay: String,
    isPositive: Boolean,
): Boolean {
    val dayList = if(isPositive) {
        listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    } else {
        listOf("Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue")
    }
    val modDay = dayList[modDayNum] // modDay 날짜 구하기
    val modIndex = dayList.indexOf(modDay) // modDay 인덱스 구하기
    val compareIndex = dayList.indexOf(compareDay) // compareDay 인덱스 구하기

    return modIndex >= compareIndex // modDay 인덱스가 compareDay 인덱스보다 같거나 더 크면 포함되는 것임.
}