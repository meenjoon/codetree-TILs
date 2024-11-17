import java.util.*
import kotlin.math.*

data class Student(
    val height: Int,
    val weight: Int,
    val index: Int,
) {
    override fun toString(): String {
        return "$height $weight $index"
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextLine().toInt()

    val studentList = mutableListOf<Student>()
    repeat(n) { repeatIndex ->
        val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
        studentList.add(
            Student(
            height = a,
            weight = b,
            index = repeatIndex + 1,
            )
        )
    }

    studentList.sortedWith(compareBy<Student>{ it.height }.thenByDescending{ it.weight}).forEach { student ->
        println(student)
    }

    // studentList.sortedWith(compareBy({ it.height }, { -it.weight })).forEach { student ->
    //     println(student)
    // }
}