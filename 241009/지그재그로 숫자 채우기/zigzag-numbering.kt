import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    val m = sc.nextInt()
    
    val array = Array(n) { IntArray(m) }

    for(i in 0..n-1) {
        for(j in 0..m-1) {
            if(j % 2 == 0) {
                array[i][j] = (j * n) + i
            } else {
                array[i][j] = ((j + 1) * n) - (i + 1)
            }
        }
    }

    for(i in array.indices) {
        for(j in array[i].indices) {
            print("${array[i][j]} ")
        }
        println("")
    }
}