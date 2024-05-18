package exercises_01

import kotlin.math.pow

/** ATIVIDADE 13:
 * Escreva um programa em Kotlin que receba o peso e a altura de uma pessoa e calcule o seu índice de massa corporal (IMC).
 */
fun getBMI(weight: Int, height: Double): Double {
    val BMI = weight / height.pow(2)
    val roundedBMI = Math.round(BMI * 10.0) / 10.0
    return roundedBMI
}
fun main() {
    val bodyMassIndex = getBMI(70, 1.8)
    println(bodyMassIndex)
}