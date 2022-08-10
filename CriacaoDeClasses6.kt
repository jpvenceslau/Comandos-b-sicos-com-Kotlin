//First part
data class Person (val firstName: String, val lastName: String, val age: Int) {
    fun fullName(): String {
        return "$firstName $lastName"
    }
}

//Second part
data class Order(val amount: Int, val user: Person) 


/*
data class é uma classe de dados, ou seja, é um
objeto definido pelo seus dados
*/

//Third part
fun main() {
    val p1 = Person("João", "Paulo", 15)
    val p2 = Person("João", "Paulo", 15)
    println(p1)
    println(p2)
    println(p1==p2)
    
    println(p1.component1())
    
    println(p1.fullName())
    
    val copia = p1.copy(age = 23)
    
    println(copia)
    
    val test = Order(amount = 15, user = copia)
    println(test)
}