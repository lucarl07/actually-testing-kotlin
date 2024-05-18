package exercises_01
/** ATIVIDADE 08:
 * Desenvolva uma função em Kotlin que receba uma lista de nomes e retorne a lista ordenada em ordem alfabética, ignorando maiúsculas e minúsculas.
 */
fun sortListAlphabetically(arr: MutableList<String>): List<String> {
    return arr.sortedWith(
        compareBy(String.CASE_INSENSITIVE_ORDER) {
            char -> char.toString()
        }
    )
}
fun main() {
    // Ordenar a lista inicial:
    val messyList = mutableListOf("Zoe", "Maria", "Clark", "Josh", "Annah", "Marcus")
    println(sortListAlphabetically(messyList))

    // Adicionar mais nomes:
    messyList.add("Bruno")
    println(sortListAlphabetically(messyList))
}
