import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val list = mutableListOf<Int>()
    while(true) {
        val a = sc.nextInt()

        if(a == -999 || a == 999) {
            break
        }
        list.add(a)
    }

    val maxNum = list.maxOrNull()
    val minNum = list.minOrNull()

    print("$maxNum $minNum")
}