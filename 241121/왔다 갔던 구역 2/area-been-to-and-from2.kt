import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val map = mutableMapOf<Int, Int>()
    var distance = 0
    repeat(n) {
        val (a, b) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0].toInt(), second = it[1])
        }

        val tempDistance = distance
        distance = if(b == "R") {
            distance + a
        } else {
            distance - a
        }

        if(distance >= tempDistance) {
            // distance 가 더 큰 경우
            for(i in tempDistance..distance) {
                map[i] = map.getOrDefault(i, 0) + 1
            }
        } else {
            // tempDistance 가 더 큰 경우
            for(i in distance..tempDistance) {
                map[i] = map.getOrDefault(i, 0) + 1
            }
        }
    }

    val formattedMap = map.filter { it.value >= 2 }
        .toList()
        .sortedBy { it.first }
        .toMap()

    var totalSum = 0 // 최종 결과 합산
    var startKey = 0 // 현재 구간의 시작 키
    var endKey = 0 // 현재 구간의 끝 키

    for ((index, entry) in formattedMap.entries.withIndex()) {
        val key = entry.key

        if (index == 0) {
            // 첫 번째 키는 구간의 시작점으로 설정
            startKey = key
            endKey = key
            continue
        }

        if (key == endKey + 1) {
            // 키가 연속적인 경우, 구간의 끝 업데이트
            endKey = key
        } else {
            // 연속이 끊긴 경우, 현재 구간의 길이 합산
            totalSum += endKey - startKey // 구간의 차이를 추가
            startKey = key // 새로운 구간 시작
            endKey = key
        }
    }

    // 마지막 구간 처리
    totalSum += endKey - startKey

    println(totalSum)
}