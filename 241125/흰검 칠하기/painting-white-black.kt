import java.util.*
import kotlin.math.*

data class Block(
    var blockColor: String = "",
    var blackNum: Int = 0,
    var whiteNum: Int = 0,
){} 

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val map = mutableMapOf<Int, Block>()

    var lastRangeNum = 0
    repeat(n) {
        val (a, b) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0].toInt(), second = it[1])
        }

        var firstRangeNum = lastRangeNum
        if(b == "R") {
            lastRangeNum += a - 1
        } else {
            lastRangeNum -= a - 1
        }

        if(lastRangeNum > firstRangeNum) {
            for(i in firstRangeNum..lastRangeNum) {
                if(b == "R") {
                    val block = map.getOrDefault(i, Block(blockColor = "black"))
                    map[i] = block.copy(blockColor = "black", blackNum = block.blackNum + 1)
                } else {
                    val block = map.getOrDefault(i, Block(blockColor = "white"))
                    map[i] = block.copy(blockColor = "white", whiteNum = block.whiteNum + 1)
                }
            }
        } else {
            for(i in lastRangeNum..firstRangeNum) {
                if(b == "R") {
                    val block = map.getOrDefault(i, Block(blockColor = "black"))
                    map[i] = block.copy(blockColor = "black", blackNum = block.blackNum + 1)
                } else {
                    val block = map.getOrDefault(i, Block(blockColor = "white"))
                    map[i] = block.copy(blockColor = "white", whiteNum = block.whiteNum + 1)
                }
            }
        }
    }

    val whiteBlockNum = map.filter { !(it.value.blackNum >= 2 && it.value.whiteNum >= 2) && it.value.blockColor == "white" }.count()
    val blackBlockNum = map.filter { !(it.value.blackNum >= 2 && it.value.whiteNum >= 2) && it.value.blockColor == "black" }.count()
    val grayBlockNum = map.filter { it.value.blackNum >= 2 && it.value.whiteNum >= 2 }.count()
    
    println("$whiteBlockNum $blackBlockNum $grayBlockNum")
}