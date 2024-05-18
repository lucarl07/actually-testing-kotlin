package exercises_01
/** ATIVIDADE 04:
 * Desenvolva uma função em Kotlin que receba uma lista de strings e retorne uma lista contendo apenas as strings que possuem mais de 5 caracteres.
 **/
fun getStringsLongerThanInt(minLength: Int = 5, arr: List<String>) = arr.filter {
    it.length > minLength
}
fun main() {
    val phrases = listOf("hi", "hello world", "what's up?", "test", "peace", "broke...")
    println(getStringsLongerThanInt(arr = phrases))
}