import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ")

    var findIndex = -1
    for(i in 0..a.length-2) {
        if(b == a[i].toString()) {
            findIndex = i
            break
        }
    }
    
    if(findIndex != 1) {
        print("$findIndex")
    } else {
        print("No")
    }
}