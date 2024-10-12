import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    val map = mutableMapOf<String, Int>()
    for(i in 0..a.length-2) {
        val str = a[i].toString() + a[i+1].toString()
        if(str == "ee") {
            map["ee"] = map.getOrDefault("ee", 0) + 1
        }

        if(str == "eb") {
            map["eb"] = map.getOrDefault("eb", 0) + 1
        }
    }

    print("${map.getOrDefault("ee", 0)} ${map.getOrDefault("ee", 0)}")
}