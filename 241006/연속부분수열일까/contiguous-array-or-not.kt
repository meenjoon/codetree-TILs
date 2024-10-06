import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    val b = sc.nextLine().trim().split(" ").map { it.toInt() }

    var isSatisfied = false
   
    for(i in 0..a.lastIndex) {
         var success = true

        for(j in 0..b.lastIndex) {
            if(i + j >= a.size) {
                success = false
                break
            }

            if(a[i + j] != b[j]) {
                success = false
                break
            }
        }

        if(success) {
            println("Yes")
            isSatisfied = true
            break
        }
    }
    if(!isSatisfied) {
        println("No")
    }

    
    // val cntSet = mutableSetOf<Int>()

    // var flag = false
    // var satisfiedIndex = -1
    // var cnt = 0
    
    // for(i in 0..a.lastIndex) {
    //     for(j in 0..b.lastIndex) {
    //         if(flag) {
    //             if(satisfiedIndex + 1 <= b.lastIndex) {
    //                 if(a[i] == b[satisfiedIndex + 1]) {
    //                     flag = true
    //                     cnt++
    //                     satisfiedIndex += 1
    //                     cntSet.add(cnt)
    //                     break
    //                 } else {
    //                     if(a[i] == b[j]) {
    //                         cnt = 0
    //                         flag = true
    //                         satisfiedIndex = j
    //                         cnt++
    //                         cntSet.add(cnt)
    //                         break
    //                     } else {
    //                         flag = false
    //                     }
    //                 }
    //             }
    //         }

    //         if(a[i] == b[j]) {
    //             flag = true
    //             satisfiedIndex = j
    //             cnt++
    //             cntSet.add(cnt)
    //             break
    //         } else {
    //             flag = false
    //         }           
    //     }

    //     if(flag == false) {
    //         cnt = 0
    //     }
    // }

    // if(cntSet.maxOrNull() == b.size) {
    //     print("Yes")
    // } else {
    //     print("No")
    // }
}