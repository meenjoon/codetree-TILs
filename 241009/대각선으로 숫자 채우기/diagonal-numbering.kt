import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    val m = sc.nextInt()

    val array = Array(n) { IntArray(m) }

    var cnt = 1

    // 먼저 0부터 컬럼의 사이즈까지 왼쪽 아래 대각선 방향(+1이 되는 방향)으로 쭉 값을 채워 넣음
    // 중요한 것은 반복문을 돌아 다음 채워질 인덱스의 로우의 값을 보면 무조건 0번째 인덱스의 로우에서 시작(고정)하는 것을 알 수 있음
    // ==> 그래서 로우는 증가, 컬럼은 감소
    for(col in 0..m-1) {
        var currRow = 0 // 여기선 row가 고정
        var currColumn = col

        while(currColumn >= 0 && currRow < n) {
            array[currRow][currColumn] = cnt

            currRow++
            currColumn--
            cnt++
        }
    }

    // 위의 for문에서 채워넣지 못하는 부분을 왼쪽 아래 대각선 방향(+1이 되는 방향)으로 쭉 값을 채워 넣음
    // 중요한 것은 채워지지 않는 위치의 인덱스 중에 컬럼의 값을 보면 무조건 마지막 컬럼(m의 사이즈 -1)에서 시작(고정)하는 것을 알 수 있음
    // ==> 그래서 로우는 증가, 컬럼은 감소
    for(row in 1..n-1) {
        var currRow = row
        var currColumn = m - 1 // 여기선 column이 고정

        while(currRow <= n-1 && currColumn >= 0) {
            array[currRow][currColumn] = cnt

            currRow++
            currColumn--
            cnt++
        }
    }

    for(i in array.indices) {
        for(j in array[i].indices) {
            print("${array[i][j]} ")
        }
        println("")
    }
}