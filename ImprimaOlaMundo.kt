// Comentário qualquer em uma linha

/* Comentário delimiado por
duas barras e asterísticos */

fun main() {
    println("Olá, Mundo!")

    
    var message = """
    Olá!
    Como você está?
    Eu estou bem, e você?""".trimIndent() // função usada para ajeitar as coisas no canto
    println(message)

    message = """
    Mensagem1
    Mensagem2
    Mensagem3
    """.replaceIndent("-> ") // Coloca '-> ' no começo de cada linha
    println(message)
    
    message = """
    .Mensagem1
    .Mensagem2
    .Mensagem3
    """.trimMargin(".") // retira tudo o que estiver antes do ponto
    println(message)

    var age = 18
    var name = "João"
    println("Meu nome é $name e minha idade é $age")
}

// Saída: Olá, Mundo!