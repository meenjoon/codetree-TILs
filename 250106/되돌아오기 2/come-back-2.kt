import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val direction = sc.nextLine()

    val dx = intArrayOf(1, 0 , -1, 0)
    val dy = intArrayOf(0, -1, 0, 1)
    // 0 위
    // 3 오른
    // 2 아래
    // 1 왼

    var x = 0
    var y = 0

    var t = 0
    var currTime = -1

    var currDirection = 0

    for(i in 0..direction.length-1) {
        if(direction[i] == 'F') {
            t += 1
            
            x += dx[currDirection]
            y += dy[currDirection]

            if(x == 0 && y == 0) {
                currTime = t
                break
            }
        } else {
            t += 1
            
            currDirection = if(direction[i] == 'R') (currDirection - 1 + 4) % 4 else (currDirection + 1) % 4
        }
    }

    print(currTime)
}