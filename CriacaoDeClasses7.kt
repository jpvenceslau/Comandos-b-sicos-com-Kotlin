// First part

abstract class Veiculo(cor: String, numeroDePortas: Int, numeroDeRodas: Int)  { //classe abstrata
    
    fun abrirPorta () {
        
    }
    
    abstract fun dirigir()
}

// Second part

class Carro(cor: String, numeroDePortas: Int, numeroDeRodas: Int): Veiculo(cor, numeroDePortas, numeroDeRodas) {
    override fun dirigir() {
        println("Vrum vrum")
    }
}

// Third part

fun main() {
    val carro = Carro("Verde", 4, 2)
    carro.dirigir()
    
}