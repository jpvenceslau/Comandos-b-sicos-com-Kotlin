data class Person(val name: String)

fun main() {
    val people = listOf(
    Person("Rodrigo"),
    Person("Marcia"),
    Person("Paula"),
    )
        
    for (i in people) {
        println(i)
    }
}