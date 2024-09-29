import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    // 위쪽
    // for(i in 1..n) {
    //     for(j in i..n * i step i) {
    //         print("$j ")
    //     }
    //     println("")
    // }

    for(i in 1..n) {
        for(j in i * n downTo i step i) {
            print("$j ")
        }
        println("")
    } 
}