import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()

    while(n <= 100) {
        if(n >= 90) {
            print("A ")
        } else if(n >= 80) {
            print("B ")
        } else if(n >= 70) {
            print("C ")
        }
        else if(n >= 60) {
            print("D ")
        }
        else if(n < 60) {
            print("F ")
        }
        n++
    }
}