package exercises_01

import java.util.Calendar

/** ATIVIDADE 12:
 * Desenvolva uma função em Kotlin que verifique se um ano é bissexto.
 */
fun checkForLeapYear(year: Int) = when {
    year % 4 == 0 -> "$year is a leap year!"
    else -> "$year is not a leap year..."
}

// Obtendo uma instância da classe Calendar:
var calendar: Calendar = Calendar.getInstance()
fun main() {
    val thisYear = calendar.get(Calendar.YEAR)
    val isThisALeapYear = checkForLeapYear(thisYear)
    println(isThisALeapYear)
}