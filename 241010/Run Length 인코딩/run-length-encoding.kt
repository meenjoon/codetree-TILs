import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.next()

    val list = mutableListOf<String>()

    var rememberChar = a[0]
    var cnt = 1

    for (i in 1..a.lastIndex) {
        val char = a[i]

        if (char == rememberChar) {
            cnt++
        } else {
            // 문자열 추가
            list.add(rememberChar.toString())

            // 숫자 추가
            val cntStr = cnt.toString()
            cntStr.forEach {
                list.add(it.toString())
            }

            rememberChar = char
            cnt = 1
        }
    }

    // 마지막 문자의 카운트를 출력
    // 문자열 추가
    list.add(rememberChar.toString())

    // 숫자 추가
    val cntStr = cnt.toString()
    cntStr.forEach {
        list.add(it.toString())
    }

    println("${list.size}")
    list.forEach {
        print("$it")
    }
}