package exercises_01
/** ATIVIDADE 14:
 * Crie uma função em Kotlin que receba uma string contendo uma frase e retorne a quantidade de palavras na frase.
 */
fun getPhraseLength(string: String): Int {
    // Utiliza apenas a primeira palavra de uma string
    val phrase = when {
        string.contains("/") -> string.split("/")[0]
        string.contains(" ") -> string.split(" ")[0]
        else -> string
    }
    return phrase.length
}
fun main() {
    val textList = listOf("We love Kotlin!", "Beginner", "Start/Stop")
    for (text in textList) {
        println(getPhraseLength(text))
    }
}
