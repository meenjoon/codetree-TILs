import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    var sumNum = 0
    for(i in 0..3) {
        for(j in 0..3) {
            val a = sc.nextInt()
            if(i >= j) {
                sumNum += a
            } else {
                continue
            }
        }
        if(i != 3) {
            sc.nextLine()
        }
    }   

    print("$sumNum")
}