import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val findIndex = a.indexOf(0)

    var sumNum = 0
    for(i in findIndex-3..findIndex-1) {
        sumNum += a[i]
    }
    
    print("$sumNum")
}