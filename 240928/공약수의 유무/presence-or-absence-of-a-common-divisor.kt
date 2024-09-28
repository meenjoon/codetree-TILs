import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    var isCommon = false

    for(i in a..b) {
        if(1920 % i == 0 && 2880 % i == 0) {
            isCommon = true
            break
        }
    }

    if(isCommon) print("1") else print("0")
}