import java.util.*
import kotlin.math.*

data class User(
    val name: String,
    val addr: String,
    val city: String,
) {
    override fun toString(): String {
        return "name $name\naddr $addr\ncity $city"
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val list = mutableListOf<User>()
    repeat(n) {
        val (name, addr, city) = sc.nextLine().trim().split(" ")

        val user = User(
            name = name,
            addr = addr,
            city = city
        )

        list.add(user)
    }

    val latestNameOfUser = list.maxByOrNull { it.name }

    print(latestNameOfUser)
}