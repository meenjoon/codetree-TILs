import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, k, t) = sc.nextLine().trim().split(" ")
    val array = Array(n.toInt()) { sc.next() }

    val list = mutableListOf<String>()
    for(i in array.indices) {
        if(array[i].length >= t.length) {
            val sliceStr = array[i].slice(0..t.length-1)
            if(sliceStr == t) {
                list.add(array[i])
            }
        }
    }

    print(list.sorted()[k.toInt()-1])
}