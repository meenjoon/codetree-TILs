import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m, k) = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    // 벌칙 학생 번호가 들어있는 배열
    val personArray = IntArray(10000)
    // 모든 학생들의 벌칙 수가 들어있는 배열
    val wrongArray = IntArray(101) 

    for(i in 0..m-1) {
        personArray[i] = sc.nextInt()
    }

    var resultNum = -1

    for(i in 0..m-1) {
        val num = personArray[i]
        wrongArray[num] += 1

        if(wrongArray[num] == k) {
            resultNum = num
            break
        }
    }

    // val map = mutableMapOf<Int, Int>()

    // var resultNum = -1
    // for(i in 0..m-1) {
        // val a = sc.nextInt()
        
        // map[a] = map.getOrDefault(a, 0) + 1
        // if(map[a] == k) {
        //     resultNum = a
        //     break
        // }
    // }

    print(resultNum)
}