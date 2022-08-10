fun main() {
    val users = arrayOf(
    User("João", "Paulo"),
    User("Maria", "Dorvina")
    )
    
    users.forEach{println(it)}
    
    println(users[0])
    println("----------------------------")
    val newList = users.plus(User("Zeca","Soares"))
    newList.forEach{println(it)}

}

class User(val firstName: String, val lastName: String) {
    
    fun fullName() = "$firstName $lastName"
    
    override fun toString(): String {
        return fullName()
    }
}