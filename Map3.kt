fun main() {
    val estados = mapOf(
    "SP" to "São Paulo",
    "BA" to "Bahia",
    "CE" to "Ceara"
    )
    
    val sigla = estados.getOrDefault("SaP", "Estado desconhecido")
    val chaves = estados.keys
    val valores = estados.values
    val entradas = estados.entries
    println(sigla)
    println(chaves)
    println(valores)
    println(entradas)
    println(estados)
}