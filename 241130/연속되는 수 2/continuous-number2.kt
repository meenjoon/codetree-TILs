import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val array = IntArray(n)
    repeat(n) { it ->
        val a = sc.nextInt()
        array[it] = a
    }

    var continueFlag = false
    var continueCnt = 1
    var cntList = mutableListOf<Int>()
    for(i in 0..array.size-1) {
        if(i == 0) {
            continue
        }

        if(array[i] == array[i-1]) {
            continueFlag = true
        } else {
            continueFlag = false
        }

        if(continueFlag) {
            continueCnt++
        } else {
            continueCnt = 1
        }
        cntList.add(continueCnt)
    }

    print(cntList.maxOrNull())
}