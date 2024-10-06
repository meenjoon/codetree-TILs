import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val a = sc.nextLine().trim().split(" ").joinToString(separator = "")
    
    val b = sc.nextLine().trim().split(" ").joinToString(separator = "")

    var flag = false
    var satisfied = -1
    var cnt = 0
    for(i in 0..a.lastIndex) {
        for(j in 0..b.lastIndex) {
            if(flag) {
                if(satisfied + 1 < b.lastIndex) {
                    if(a[i] == b[satisfied + 1]) {
                        flag = true
                        satisfied = j
                        cnt++
                        continue
                    }
                }
            } else {
                cnt = 0
                if(a[i] == b[j]) {
                    flag = true
                    satisfied = j
                    cnt++
                    continue
                }
            }
        }
    }

    if(cnt == b.length) {
        print("Yes")
    } else {
        print("No")
    }
    
}