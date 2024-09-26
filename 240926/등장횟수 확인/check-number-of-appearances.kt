import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var evenCnt = 0
    
    repeat(5) {
        val a = sc.nextInt()
        if(a % 2 == 0) {
            evenCnt++
        }
    }

    print("$evenCnt")
}