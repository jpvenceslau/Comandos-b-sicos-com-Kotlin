// First part

class User(firstName: String, lastName:String)  {
    var fullName = "$firstName $lastName"
    	get() = "Full name: $field"
    	set(value) {
            if (value.startsWith("Jonata")) {
                field = "Jonatass"
            } else {
                field = value
            }
        }
}

// Second part

fun main() {
    val user1 = User("Joao", "Paulo")
    println(user1.fullName)
    
    user1.fullName = "Jonata rodrigues"
    println(user1.fullName)
    
    user1.fullName = "Miguel san"
    println(user1.fullName)
}