package exercises_01
/** ATIVIDADE 01:
 * Escreva uma função em Kotlin que receba uma lista de números inteiros e retorne a soma dos números pares contidos na lista.
 **/
fun sumOfInt(list: List<Int>): Int {
    return list.sum()
}
fun main() {
    val myNumList = listOf(3, 4, 6, 11, 8, 42)

    val sumOfMyList: Int = sumOfInt(myNumList)

    println(sumOfMyList)
}