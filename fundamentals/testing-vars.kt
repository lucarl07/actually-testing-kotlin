fun main() {
    val variavel: Any = listOf(1, 2, 3, 4)
    
    when (variavel) {
        is String -> println("A variável é uma string")
        is Int -> println("A variável é um número inteiro")
        is List<*> -> println("A variável é uma lista.")
        // O conteúdo entre setas (<...>) é um argumento, ao menos que 
        // se passe um asterisco (*), usado para denotar o tipo em si.
        else -> println("A variável corresponde a outro tipo.")
    }
}