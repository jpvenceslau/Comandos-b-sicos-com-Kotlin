//////////////////////////////////////////////////////////////////////////
abstract class Person(var firstName: String, var lastName: String) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}

//////////////////////////////////////////////////////////////////////////
class User(firstName: String, lastName: String): Person(firstName, lastName) {
    fun greetings() {
        println ("Hello $firstName")
    }
}

//////////////////////////////////////////////////////////////////////////
fun main() {
    val listWithDuplicates = setOf("Gago", "Gaguinho", "Gagão", "Gago", "Gargalo", "Gargalo")
    listWithDuplicates.forEach{println(it)}   		//Sem duplicatas
    println("---------------")
    
    val listNames = mutableSetOf(
    User("João", "Pedro").greetings(),
    User("João", "Pedro").greetings(),
    User("João", "Pedro").greetings(),
    )
    
    listNames.forEach{println(it)}					//Objetos não são iguais
}