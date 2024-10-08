import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m  = sc.nextInt()
    sc.nextLine()

    val aArray = Array(n) { IntArray(m) }
    val bArray = Array(n) { IntArray(m) }

    for(i in 0..n-1) {
        for(j in 0..m-1) {
            val num = sc.nextInt()
            aArray[i][j] = num
        }
        sc.nextLine()
    }

    for(i in 0..n-1) {
        for(j in 0..m-1) {
            val num = sc.nextInt()
            bArray[i][j] = num
        }
        if(i != n-1) {
            sc.nextLine()
        }
    }

    for(i in 0..n-1) {
        for(j in 0..m-1) {
            val isSame = aArray[i][j] == bArray[i][j]
            print("${if(isSame) "0" else "1"} ")
        }

        println("")
    }
}