import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ")

    a.forEachIndexed { index, value ->
        if(index == 1 || index == 4 || index == 7) {
            print("$value ")
        }        
    }
}