import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().toCharArray().sorted()
    val b = sc.nextLine().toCharArray().sorted()

    if(a == b) print("Yes") else print("No")
}