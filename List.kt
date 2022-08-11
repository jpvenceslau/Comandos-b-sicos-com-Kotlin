fun main() {
    val pessoas = listOf(
    Pessoa("João", "Pedro"),
    Pessoa("Fabio", "Paulo"),
    Pessoa("Maria", "Rodrigues")
    )   
    
    pessoas.forEach{println(it)}
    
}

class Pessoa(val nome: String, val sobrenome: String) {
    
    fun nomeCompleto() = "$nome $sobrenome"
    override fun toString() = nomeCompleto()
    
}