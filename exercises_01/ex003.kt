package exercises_01
/** ATIVIDADE 03:
 * Implemente uma função em Kotlin que verifique se uma senha atende aos seguintes critérios: pelo menos 8 caracteres,
 * contendo pelo menos uma letra maiúscula, uma letra minúscula e um número.
 * **/
fun validatePassword(password: String): String {
    var hasUpperCases = 0
    var hasLowerCases = 0
    var hasNumber = 0
    
    for (char in password) when {
        char.isLowerCase() -> hasLowerCases++
        char.isUpperCase() -> hasUpperCases++
        char.isDigit() -> hasNumber++
    }

    return if (password.length >= 8 &&
        hasUpperCases > 0 && hasLowerCases > 0 && hasNumber > 0)
    {
        "A senha atende aos requisitos."
    } else {
        "A senha é inválida."
    }
}

fun main() {
    val passwords = listOf("1h820z3K", "AdB3Cf", "ljk012cc", "10TRUTHs")
    for (password in passwords) {
        println(validatePassword(password))
    }
}