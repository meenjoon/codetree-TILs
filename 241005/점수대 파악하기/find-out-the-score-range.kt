import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    val array = IntArray(10) // 100으로 배열의 크기를 설정하여 점수에 대해 키 값으로 사용할 수 있지만 효율을 위해 10으로 크기로 설정하고 출력할 때 점수를 가공함.

    for(i in a.indices) {
        if(a[i] == 0 ) {
            break
        }

        val result = a[i] / 10

        if(a[i] == 100) {
            array[9] += 1
        } else if(a[i] >= 10) {
            array[result - 1] += 1
        }
    }

    array.reversedArray().forEachIndexed { index, value ->
        println("${array.size - index}0 - $value" )
    }
}