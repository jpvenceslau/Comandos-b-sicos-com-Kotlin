fun main() {
    val mercado1 = listOf(
    Mercadorias(listOf("Banana","Maça")),
    Mercadorias(listOf("Peixe","Frango")),
    Mercadorias(listOf("Arroz","Feijão", "Macarrão"))
    )
    
    //Lista geral
    val mercadoriasMercado1 =  mercado1.flatMap{it.mercadorias}
    println(mercadoriasMercado1)
    println("-------")
    
    //Lista de listas
    val mercadoriasPorSeccaoMercado1 =  mercado1.map{it.mercadorias}
    println(mercadoriasPorSeccaoMercado1)
    println("-------")
    
}

class Mercadorias(val mercadorias: List<String>)