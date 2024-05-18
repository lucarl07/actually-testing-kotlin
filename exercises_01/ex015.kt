package exercises_01
/** ATIVIDADE 15:
 * Implemente uma função em Kotlin que receba uma lista de números inteiros e retorne a média dos números, ignorando os números repetidos.
 */
fun getMeanOfSet(list: List<Int>): Int {
    val set = list.toSet()
    return set.sum() / set.size
}
fun main() {
    val myList = listOf(10, 15, 20, 25)
    val averageOfMyList = getMeanOfSet(myList)
    println(averageOfMyList)
}