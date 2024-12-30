import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val dirString = sc.nextLine()

    val arrayX = intArrayOf(1, 0, -1, 0)
    val arrayY = intArrayOf(0, -1, 0, 1)

    var currDirection = 3 // 북쪽

    var x = 0
    var y = 0

    for(i in 0..dirString.length-1) {
        val dir = dirString[i]
        
        if(dir == 'L') {
           val resultDirection = currDirection - 1
           currDirection = resultDirection % 4
        } else if(dir == 'R') {
            val resultDirection = currDirection + 1
            currDirection = resultDirection % 4
        } else {
            x += arrayX[currDirection]
            y += arrayY[currDirection]
        }
    }

    print("$x $y")
}