import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val list = mutableListOf<String>()
    repeat(n) {
        list.add(sc.nextLine())
    }

    val a = sc.next()[0]

    var cnt = 0
    var lengthSum = 0.0
    list.forEach { str ->
        if(str[0] == a) {
            cnt++
            lengthSum += (str.length).toDouble()
        }
    }

    val lengthAvg = round((lengthSum / cnt) * 100) / 100
    val formattedAvg = String.format("%.2f", lengthAvg)
    print("$cnt $formattedAvg")
}