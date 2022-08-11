fun main() {
    val nomesComL = mutableListOf("Agnaldo", "Luis")
    val listaNomes = listOf("Pedro", "Marcelo", "Maria", "João", "Henrique","Larissa")
    
    listaNomes.filterTo(nomesComL, {it.lowercase().contains("l")}) // Busca nomes com L em listaNomes e adiciona em nomeComL
    
   println(nomesComL)
}