package exercises_01
/** ATIVIDADE 05:
 * Escreva um programa em Kotlin que receba o valor de uma compra e aplique um desconto de 10% se o valor da compra for maior que R$ 100,00.
 **/
fun applyDiscount(purchase: Double): Double {
    val finalPrice = when {
        purchase > 100.00 -> purchase * 0.9
        else -> purchase
    }
    return finalPrice
}

fun main() {
    println(applyDiscount(100.5))
}