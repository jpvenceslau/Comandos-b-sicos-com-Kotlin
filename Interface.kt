//////////////////////////////////////////
interface ConferidorClique { // interface não tem um corpo -> não possui objetos e metodos
    fun clicado()
}

//////////////////////////////////////////
class Botao: Visualizador()
class Imagem: Visualizador()
class Mapa: Visualizador()


abstract class Visualizador {
    lateinit var clicador: ConferidorClique
    
    fun clique() {
        clicador.clicado()
    }
}

/////////////////////////////////////////////
fun main() {
    var botao = Botao()
    botao.clicador = object: ConferidorClique {
        override fun clicado() {
            println("Foi clicado")
        }
    }
    botao.clique()   
}