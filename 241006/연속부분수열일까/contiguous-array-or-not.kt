import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val a = sc.nextLine().trim().split(" ").joinToString(separator = "")
    
    val b = sc.nextLine().trim().split(" ").joinToString(separator = "")

    val cntSet = mutableSetOf<Int>()

    var flag = false
    var cnt = 0
    
    for(i in 0..a.lastIndex) {
        for(j in 0..b.lastIndex) {
            if(a[i] == b[j]) {
                flag = true
                cnt++
                cntSet.add(cnt)
                continue
            } else {
                flag = false
            }           
        }

        if(flag == false) {
            cnt = 0
        }
    }

    if(cntSet.maxOrNull() == b.length) {
        print("Yes")
    } else {
        print("No")
    }
}