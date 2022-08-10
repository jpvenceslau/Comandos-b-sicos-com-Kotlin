//Primeira parte
class Usuario(var nickName: String, var tipoDeConta: TipoDeConta = TipoDeConta.BRONZE) {
    fun bemVindo() = println("Seja bem vindo $nickName, atualmente sua conta é do tipo $tipoDeConta")
}


enum class TipoDeConta {
    BRONZE {
        override fun calcularDisconto() = 5
    },
    PRATA {
        override fun calcularDisconto() = 10
    },
    OURO {
        override fun calcularDisconto() = 15
    };
    
    abstract fun calcularDisconto(): Int
    
}

fun main() {
    val daApi = "ouro"
    val tipoDeConta = TipoDeConta.valueOf(daApi.uppercase())
    println(tipoDeConta.calcularDisconto())
}