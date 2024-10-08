import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val array = Array(n) { IntArray(n) }

    var cnt = 1

    val isEvenN = if(n % 2 == 0) true else false

    
    if(isEvenN) {
        for(col in n-1 downTo 0) {
            val isEvenRow = if(col % 2 == 0) true else false

            var currRow = if(isEvenRow) {
                0
            } else {
                n-1
            }
            var currColumn = col
            
            while(currRow >= 0 && currRow <= n-1 && currColumn >= 0 && currColumn <= n-1) {
                array[currRow][currColumn] = cnt

                if(isEvenRow) {
                    currRow++
                } else {
                    currRow--
                }
                
                cnt++
            }
        }
    } else {
        for(col in n-1 downTo 0) {
            val isEvenRow = if(col % 2 == 0) true else false

            var currRow = if(isEvenRow) {
                n-1
            } else {
                0
            }
            var currColumn = col
            
            while(currRow >= 0 && currRow <= n-1 && currColumn >= 0 && currColumn <= n-1) {
                array[currRow][currColumn] = cnt

                if(isEvenRow) {
                    currRow--
                } else {
                    currRow++
                }
                
                cnt++
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