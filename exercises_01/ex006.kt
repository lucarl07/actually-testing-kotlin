package exercises_01
/** ATIVIDADE 06:
 * Crie uma função em Kotlin que receba uma lista de números e retorne o maior número primo contido na lista.
 */
fun getBiggestOddInt(arr: List<Int>): Int {
    val oddInts = arr.filter { it.mod(2) != 0 }
    return oddInts.max()
}

fun main() {
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    val biggestOddInt = getBiggestOddInt(fibonacci)
    println(biggestOddInt)
}