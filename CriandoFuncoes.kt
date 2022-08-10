fun main() {
    description(name="João", age=18,lastName = "Paulo",married = true)
}

fun description(name:String, age:Int, lastName:String, married:Boolean) {
    println("Hi $name $lastName, you are $age. Marrried: $married ")
}