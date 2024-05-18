package exercises_01
/** ATIVIDADE 07:
 * Implemente uma função em Kotlin que receba uma lista de números inteiros e retorne a soma dos números que são múltiplos de 3 ou 5.
 */
fun sumMultiplesOf3Or5(arr: List<Int>): Int {
    val sumMOf3 = arr.filter { it.mod(3) == 0 }.sum()
    val sumMOf5 = arr.filter { it.mod(5) == 0 }.sum()
    return sumMOf3 + sumMOf5
}

fun main() {
    val numList = listOf(1, 3, 4, 6, 8, 13, 21, 25, 29)
    println(sumMultiplesOf3Or5(numList))
}