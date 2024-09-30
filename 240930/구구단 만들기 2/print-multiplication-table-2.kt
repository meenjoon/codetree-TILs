import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.nextInt()
    val b = sc.nextInt()

    for(i in 2..8 step 2) {
        for(j in b downTo a) {
            print("$j * $i = ${j * i}${if(j != a) " / " else ""}")
        }
        println("")
    }
}