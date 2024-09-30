import java.util.*
import kotlin.math.*

fun main() {
    for(i in 1..19) {
        for(j in 1..19) {
            // j 가 19일 때 줄바꿈 O
            if(j == 19) {
                println("$i * $j = ${i * j}")
            } 
            // j 가 홀수 일 때 줄바꿈 X
            else if(j % 2 == 1) {
                print("$i * $j = ${i * j} / ")
            }
            // j 가 짝수 일 때 줄바꿈 O
            else {
                println("$i * $j = ${i * j}")
            }
        }
    }
}