import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().reversed()

    val isEven = a.length % 2 == 0
    a.forEachIndexed{ index, value ->
        if(isEven) {
            if(index % 2 == 0) {
                print("$value")
            }
        }else {
            if((index + 1) % 2 == 0) {
               print("$value")
            }
        }
        
    }
}