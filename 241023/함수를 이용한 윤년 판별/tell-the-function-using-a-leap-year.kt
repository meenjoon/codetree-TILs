import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    
    print("${isLeepYear(year = a)}")
}

fun isLeepYear(year : Int): Boolean {
    if(year % 100 == 0 && year % 400 != 0) {
        return false
    } else if(year % 4 == 0) {
        return true
    } else {
        return false
    }
}