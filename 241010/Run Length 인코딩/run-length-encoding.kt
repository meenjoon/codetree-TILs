import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    val list = mutableListOf<String>()

    var rememberChar = a[0]
    var cnt = 0
    for(i in 0..a.lastIndex) {
        val char = a[i]

        if(i == a.lastIndex) {
            if(char == rememberChar) {
                list.add(char.toString())
                val cntStr = (cnt+1).toString()
                cntStr.forEach {
                    list.add(it.toString())
                }
            } else {
                list.add(char.toString())
                val cntStr = cnt.toString()
                cntStr.forEach {
                    list.add(it.toString())
                }
            }
            break
        }

        if(char == rememberChar) {
            cnt++
        } else {
            list.add(rememberChar.toString())
            val cntStr = cnt.toString()
            cntStr.forEach {
                list.add(it.toString())
            }
            cnt = 1
        }

        rememberChar = a[i]
    }

    println("${list.size}")
    print("${list.joinToString(separator = "")}")
}