import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val (a, b) = sc.nextLine().trim().split(" ")

    val user1 = User()
    val user2 = User(id = a, level = b.toInt())

    println(user1.toString())
    print(user2.toString())
}

data class User(
    val id: String = "codetree",
    val level: Int = 10
){
    override fun toString(): String {
        return "user $id lv ${level}"
    }
}