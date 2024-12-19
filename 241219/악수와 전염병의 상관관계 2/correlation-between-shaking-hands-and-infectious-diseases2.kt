import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, k, p ,t) = sc.nextLine().trim().split(" ").map { it.toInt() }

    // 전염 횟수 관리 Map
    val diseaseAvailableMap = mutableMapOf<Int, Int>()
    // 전염 횟수 관리 Map 초기값 할당
    repeat(n) {
        diseaseAvailableMap[it+1] = k
    }

    // 관염된 사람 관리 Array
    val personArray = IntArray(n)
    // 처음 전염병에 걸려 있는 개발자에 1 할당
    personArray[p-1] = 1

    // 시간 순서대로 정렬하기 위한 IntArray 타입을 원소로 가지는 MutableList
    val list = mutableListOf<IntArray>()

    // 2번째 줄부터 입력값 받기
    repeat(t) { index ->
        val inputArray = sc.nextLine().trim().split(" ").map { it.toInt() }.toIntArray()
        list.add(inputArray) 
    }

    // 시간 순서대로 정렬하기 위해 0번째 인덱스로 정렬
    list.sortBy{ it[0] }

    list.forEachIndexed { i, value ->
        value.forEachIndexed { j, value2 ->
            // j가 1일 때, 2와 비교해서 서로 전염되었는지를 확인하고 감염 시켰다면 횟수를 차감하고 감염을 당했다면 0을 할당
            if(j == 1) {
                val valueA = value2
                val isADisease = if(personArray[valueA-1] == 1) true else false
                val diseaseAAbleCnt = diseaseAvailableMap.getOrDefault(valueA, 0)

                val valueB = list[i][j+1]
                val isBDisease = if(personArray[valueB-1] == 1) true else false
                val diseaseBAbleCnt = diseaseAvailableMap.getOrDefault(valueB, 0)

                // A,B 두 사람 모두 횟수가 0보다 클 때
                if(diseaseAAbleCnt > 0 && diseaseBAbleCnt > 0) {
                    if(isADisease && isBDisease) {
                        diseaseAvailableMap[valueA] = diseaseAAbleCnt -1
                        diseaseAvailableMap[valueB] = diseaseBAbleCnt -1
                    } else if(isADisease) {
                        diseaseAvailableMap[valueA] = diseaseAAbleCnt -1
                        personArray[valueB-1] = 1
                    } else if(isBDisease) {
                        diseaseAvailableMap[valueB] = diseaseBAbleCnt -1
                        personArray[valueA-1] = 1
                    }
                } 
                // A 사람만 감염 횟수가 존재 하면서, A 사람이 감염된 상태일 때
                else if(isADisease && diseaseAAbleCnt > 0 && diseaseBAbleCnt <= 0) {
                    diseaseAvailableMap[valueA] = diseaseAAbleCnt -1
                    personArray[valueB-1] = 1
                } 
                // B 사람만 감염 횟수가 존재 하면서, B 사람이 감염된 상태일 때
                else if(isBDisease && diseaseBAbleCnt > 0 && diseaseAAbleCnt <= 0) {
                    diseaseAvailableMap[valueB] = diseaseBAbleCnt -1
                    personArray[valueA-1] = 1
                }
            } 
        }
    }

    print(personArray.joinToString(separator = ""))
}