import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.next()

    val digit = binaryToDigit(binary = a) * 17
    val binary = digitToBinary(num = digit)

    print(binary)
}

fun binaryToDigit(
    binary: String,
): Int {
    val reversedBinary = binary.reversed()
    var num = 0
    for(i in 0..reversedBinary.length-1) {
        num += (reversedBinary[i] - '0') * (2.0).pow(i).toInt()
    }
    
    return num
}

fun digitToBinary(
    num: Int,
): String {
    var varNum = num
    var binary = ""
    while(true) {
        binary += varNum % 2
        
        if(varNum < 2) {
            break
        }

        varNum /= 2
    }

    return binary.reversed()
}