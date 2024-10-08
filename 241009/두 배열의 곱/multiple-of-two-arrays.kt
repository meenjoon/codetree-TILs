import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val aArray = Array(3) { IntArray(3) }
    val bArray = Array(3) { IntArray(3) }

    for(i in 0..2) {
        for(j in 0..2) {
            val num = sc.nextInt()
            aArray[i][j] = num 
        }
        sc.nextLine()
    }
    
    sc.nextLine()

    for(i in 0..2) {
        for(j in 0..2) {
            val num = sc.nextInt()
            bArray[i][j] = num 
        }
        
        if(i != 2) {
            sc.nextLine()
        }
    }

    for(i in 0..2) {
        for(j in 0..2) {
            val num = aArray[i][j] * bArray[i][j]
            print("$num ")
        }
        println("")
    }
}