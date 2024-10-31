import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()
    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    println(recurs(n = a.size-1, a = a))

}

// lcm()을 내부 재귀 호출을 통해 누적하며 계산하는 방식
fun recurs(n: Int, a: List<Int>): Int {
    if(n == 0){
        return a[0]
    }

    return lcm(recurs(n = n - 1, a = a), a[n])
}

fun gcd(a: Int, b: Int): Int {
    val minNum = if(a > b) a else b

    for(i in minNum downTo 1) {
        if((a % i == 0) && (b % i) == 0) {
            return i
        }
    }

    return 1
}

fun lcm(a: Int, b: Int): Int {
    val gcd = gcd(a = a , b = b)
    return gcd * (a / gcd) * (b / gcd)
}

// import java.util.*
// import kotlin.math.*

// fun main() {
//     val sc = Scanner(System.`in`)

//     val n = sc.nextLine().toInt()
//     val a = sc.nextLine().trim().split(" ").map { it.toInt() }

//     println(recurs(n = a.size-1, lcm = 1, a = a))

// }

//  lcm을 매개변수로 누적해서 전달하며 계산하는 방식
// fun recurs(n: Int, lcm: Int, a: List<Int>): Int {
//     if(n == 0){
        
//         return lcm(a = a[n], b = lcm)
//     }

//     val currLcm = lcm(a = a[n], b= a[n-1])
//     return recurs(n = n-1, lcm = lcm(a = currLcm, b = lcm), a = a)
// }

// fun gcd(a: Int, b: Int): Int {
//     val minNum = if(a > b) a else b

//     for(i in minNum downTo 1) {
//         if((a % i == 0) && (b % i) == 0) {
//             return i
//         }
//     }

//     return 1
// }

// fun lcm(a: Int, b: Int): Int {
//     val gcd = gcd(a = a , b = b)
//     return gcd * (a / gcd) * (b / gcd)
// }