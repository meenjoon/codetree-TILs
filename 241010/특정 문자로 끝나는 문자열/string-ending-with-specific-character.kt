import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val list = mutableListOf<String>()

    repeat(10) {
        list.add(sc.nextLine())
    }
    
    val b = sc.next()[0]

    var isNone = true
    list.forEach { fruit ->
        if(fruit[fruit.lastIndex] == b) {
            println(fruit)
            isNone = false
        }
    }

    if(isNone) print("None")
}