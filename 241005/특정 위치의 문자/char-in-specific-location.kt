import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    val array = Array(6) { "" }

    "LEBROS".forEachIndexed { index, value -> 
        array[index] = value.toString()
    }

    var findIndex = -1
    for(i in array.indices) {
        if(a == array[i]) {
            findIndex = i
        }
    }

    print("${if(findIndex != -1) "$findIndex" else "None"}")
}