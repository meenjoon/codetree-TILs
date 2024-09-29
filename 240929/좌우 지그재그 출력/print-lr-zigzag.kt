import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var cnt = -n + 1
    for(i in 1..n) {
        // i가 홀수 인지 짝수인지에 따라 해당 라인의 첫번째 cnt 값을 결정
        // i가 홀수라면 점점 증가하도록 첫번째 cnt 값을 설정하도록 하고,
        // i가 짝수라면 점점 감소하도록 첫번째 cnt 값을 설정하도록 한다.
        if(i % 2 == 0) {
            cnt += n + 1
        } else {
            cnt += n - 1
        }

        for(j in 1..n) {
            if(i % 2 == 1) {
                cnt++
                print("$cnt ")
            } else {
                cnt--
                print("$cnt ")
            }
        }
        println(" ")
    }
}