//Primeira parte
class Comida(marca:String) {
    var tipoDeComida = "Desconhecido"
    
    fun informacao() = println("O tipo de comida é $tipoDeComida")
    
    class Embalagem {
        var material = "Desconhecido"
        fun informacao() = println(material)
    }
    
    inner class Tamanho {						// inner class, permite chamar argumentos da classe base
        var tamanho = "Desconhecido"
        fun imprime() = println("O tipo de comida $tipoDeComida é do tamanho $tamanho")
    }
}

//Segunda parte
fun main() {
    var trakinas = Comida("Traquinas")
    trakinas.tipoDeComida = "Bolacha"
    trakinas.informacao()
    
    val grande = trakinas.Tamanho()    		//Referenciar trakinas
    grande.tamanho = "Grande"
    grande.imprime()
}