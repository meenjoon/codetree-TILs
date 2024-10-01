import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    // 10개의 문자를 저장할 수 있는 배열 선언
    val charArray = CharArray(10)

    // 배열에 문자 입력 받기
    for (i in charArray.indices) {
        val a = sc.next()[0]
        charArray[i] = a
    }

    // 배열을 거꾸로 출력
    val reversedArray = charArray.reversedArray()

    println(reversedArray.joinToString(""))
}