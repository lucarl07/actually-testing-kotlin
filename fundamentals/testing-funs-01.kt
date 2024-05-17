fun generateAnswerString(count: Int): String {
	return when (count) {
        42 -> "I have the answer."
        in 35..41 -> "The answer is near me..."
        else -> "The answer eludes me..."
    }
}

fun main() {
    val answerString = generateAnswerString(34)
    println(answerString)
}