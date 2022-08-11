fun main() {
    val listaNomes = listOf("Pedro", "Marcelo", "Maria", "João", "Henrique","Larissa")
    val apelido = listaNomes.map { it.substring(0,3).uppercase()}						//Map cria outras listas    
    println(apelido)																	//Dependendo de um critério
}