import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    for(i in 1..9) {
        for(j in b downTo a step 2) {
            print("$j * $i = ${j * i}${if(j != a) " / " else ""}")
        }
        println("")
    }

}