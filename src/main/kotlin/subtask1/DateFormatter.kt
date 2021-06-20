package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        val date: LocalDate
        try {
            date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        } catch(e: Exception) {
            return "Такого дня не существует"
        }
        return date.format(DateTimeFormatter.ofPattern("d MMMM, eeee", Locale("ru")))

    }
}
