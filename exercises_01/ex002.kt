package exercises_01
/** ATIVIDADE 02:
 * Crie uma função em Kotlin que receba uma lista de palavras e retorne a quantidade de vezes que uma palavra específica aparece na lista.
 **/
fun getNumOfInstances(list: List<String>, term: String): Int {
    return list.count { it == term }
}
fun main() {
    val friends = listOf(
        "Pete", "Gabe",
        "Ryan", "Letizia",
        "Gabe", "Danny",
        "Cicero", "Pete",
        "Glaucus", "Gabe"
    );

    val numOfGabes = getNumOfInstances(friends, "Gabe")
    val numOfPetes = getNumOfInstances(friends, "Pete")

    println("Number of Gabes: $numOfGabes \nNumber of Petes: $numOfPetes")
}

