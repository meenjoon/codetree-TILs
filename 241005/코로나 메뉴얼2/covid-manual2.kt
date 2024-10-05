import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val array = IntArray(4)
    repeat(3) {
        val a = sc.next()
        val n = sc.nextInt()

        if(a == "Y" && n >= 37) {
            array[0] += 1
        } else if(a == "N" && n >= 37) {
            array[1] += 1
        } else if (a == "Y") {
            array[2] += 1
        } else {
            array[3] += 1
        }
    }

    array.forEach { 
        print("$it ")
    }

    print("${if(array[0] >= 2) "E" else ""}")
}