import java.util.*
import kotlin.math.*

val list = mutableListOf<Int>()

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()
    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    recur(n = n - 1, a = a)

    print(list.reversed().joinToString(separator = " "))
}

fun recur(n: Int, a: List<Int>) {
    if (n == 0) {
        list.add(a[0])
        return  // 종료 조건에서 return
    }

    if ((n+1) % 2 == 1) { // 리스트는 0 인덱스부터 시작하니까 n+1 을 해줌
        val newList = a.slice(0..n).sorted()
        list.add(newList[newList.size / 2])
    }
    recur(n - 1, a) // 재귀 호출
}