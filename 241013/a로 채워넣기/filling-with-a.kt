import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = StringBuilder(sc.next())

    a[1] = 'a'
    a[a.length - 2] = 'a'

    println(a.toString())
}