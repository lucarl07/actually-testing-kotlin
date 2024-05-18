package exercises_01
/** ATIVIDADE 09:
 * Escreva um programa em Kotlin que receba o horário de entrada e saída de um funcionário e calcule o número de horas trabalhadas, desconsiderando os minutos.
 */
const val entryH = 8
const val exitH = 16
fun getWorkedHours(entryTime: Int, exitTime: Int) = exitTime - entryTime
fun main() {
    val workedHours = getWorkedHours(entryH, exitH)
    println(workedHours)
}