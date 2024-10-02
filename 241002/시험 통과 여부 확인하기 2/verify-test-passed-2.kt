import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    var cnt = 0
    repeat(n) {
        val a = sc.nextLine().trim().split(" ").map{ it.toInt() }.sum() / 4
        if(a >= 60){
            println("pass")
            cnt++ 
        } else {
            println("fail")
        } 
    }

    print("$cnt")
}