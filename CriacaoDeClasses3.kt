// First part

class Greeting {
    companion object {  				// Permite chamar a função sayHi
		fun sayHi() = println("Hi")
	}
}

// Second part

fun main() {
    Greeting.sayHi()
}