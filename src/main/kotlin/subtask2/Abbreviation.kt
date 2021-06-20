package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val expression = a.toUpperCase()
        val filtered = expression.filter { b.contains(it) }
        return if (filtered == b) "YES" else "NO"
    }
}
