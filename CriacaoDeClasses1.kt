// First part

class User (val firstName:String, val lastName:String) {

    init {
        println("Hello $firstName!")
    }
    
    constructor(firstName:String): this(firstName, lastName = "Unknown") {
        println("hum")
    }
    
//    constructor(lastName:String): this(firstName ="Unknown", lastName) {
//        println("Iha")
//    }
    
    
    fun fullName() {
        println(firstName + " " + lastName)
    }
    
    fun firstNameLength() {
        println("Length of first name: ${firstName.length}")
    }
}

// Second part

fun main() {
    val user1 = User( firstName = "Joao", lastName = "Paulo")
//    val user2 = User( lastName = "Pedro")
    
}