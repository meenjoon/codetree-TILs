import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    val m = sc.nextInt()

    val array = Array(n) { IntArray(m) }

    var cnt = 1
    for(col in 0..m-1) {
        var currRow = 0 // 여기선 row가 고정
        var currColumn = col

        while(currColumn >= 0 && currRow < n) {
            array[currRow][currColumn] = cnt

            currRow++
            currColumn--
            cnt++
        }
    }

    for(row in 1..n-1) {
        var currRow = row
        var currColumn = m - 1 // 여기선 column이 고정

        while(currRow <= n-1) {
            array[currRow][currColumn] = cnt

            currRow++
            currColumn--
            cnt++
        }
    }

    for(i in array.indices) {
        for(j in array[i].indices) {
            print("${array[i][j]} ")
        }
        println("")
    }
}