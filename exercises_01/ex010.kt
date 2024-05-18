package exercises_01
/** ATIVIDADE 10:
 * Crie uma função em Kotlin que receba uma lista de números e retorne uma nova lista contendo apenas os números pares, seguidos pelos números ímpares.
 */
fun sortOddsAndEvens(arr: List<Int>) = arr.sortedBy { it.mod(2) }
fun separateOddsAndEvens(arr: List<Int>): List<List<Int>?> {
    val mapOfLists = arr.groupBy { it.mod(2) }
    return listOf(mapOfLists[0], mapOfLists[1])
}
fun main() {
    val oneToTen = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(sortOddsAndEvens(oneToTen))
    println(separateOddsAndEvens(oneToTen))
}