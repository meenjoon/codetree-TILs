import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine()
    val b = sc.nextLine()

    print("${isContain(a = a, b = b)}")
}

fun isContain(
    a: String,
    b: String,
): Int {
    for(i in 0..a.length-1) {
        val aMaxRange = a.length - 1
        val bMaxRange = b.length - 1

        var aIndex = i // a 문자열의 시작 인덱스, a 문자열은 한 개의 문자를 시작점으로 두고 아니면 그 다음 문자점으로 시작점을 둬야 하기에 초기값으로 i로 할당
        var bIndex = 0 // b 문자열의 시작 인덱스, b 문자열은 처음부터 끝까지 돌기에 초기값을 0으로 할당
        while(aIndex <= aMaxRange && bIndex <= bMaxRange) {
            if(a[aIndex] == b[bIndex]) {
                aIndex++
                bIndex++
                continue
            } else {
                break
            }
        }

        if(bIndex == b.length) {
            return i
        }
    }

    return -1
}