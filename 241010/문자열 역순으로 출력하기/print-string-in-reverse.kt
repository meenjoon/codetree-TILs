import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val list = mutableListOf<String>()

    val a = sc.next()
    sc.nextLine()
    list.add(a)

    val b = sc.next()
    sc.nextLine()
    list.add(b)

    val c = sc.next()
    sc.nextLine()
    list.add(c)

    val d = sc.next()
    list.add(d)

    for(i in list.lastIndex downTo 0) {
        println("${list[i]}")
    }
}