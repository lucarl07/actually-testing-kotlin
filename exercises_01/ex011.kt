package exercises_01
/** ATIVIDADE 11:
 * Implemente uma função em Kotlin que receba um número inteiro positivo e retorne o número invertido.
 * Por exemplo, se o número de entrada for 123, a função deve retornar 321.
 */
fun invertNumber(num: Int): Int {
    val invStringNum = num.toString().reversed()
    return invStringNum.toInt()
}
fun main() {
    val number = 154
    println(invertNumber(number))
}