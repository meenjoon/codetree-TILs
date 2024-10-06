import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }.toIntArray()

    for(i in 0..a.lastIndex) {
        var maxNum = Int.MIN_VALUE

        for(j in i..a.lastIndex) {
            if(a[j] >= maxNum) {
                maxNum = a[j] // 큰 값
                val num = a[i] // i 인덱스에 위치하는 값 미리 저장
                a[i] = maxNum // i 인덱스에 큰 값 스위칭
                a[j] = num // i 인덱스에 큰 값이 스위칭 되었으니 이전 i 인덱스의 값을 j 인덱스에 할당해서 스위칭을 해줌
            }            
        }
    }

    a.forEachIndexed { index, value ->
        if(index == 0 || index == 1) {
            print("$value ")
        }
    }
}