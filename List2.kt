fun main() {
    val numbers = listOf(12,15,16,19,18,13,17)
    
    numbers.forEachIndexed { index, number ->
        println("Index: ${index+1}; Number: $number")
    }
}