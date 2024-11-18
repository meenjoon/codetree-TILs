import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    var n = sc.nextInt()

    val list = mutableListOf<Int>()
    while(true) {
        if(n < 2) {
            if(n == 1) {
                list.add(n)
            }
            break
        }
        list.add(n % 2)
        n = n / 2
    }
    print(list.reversed().joinToString(separator=""))
}