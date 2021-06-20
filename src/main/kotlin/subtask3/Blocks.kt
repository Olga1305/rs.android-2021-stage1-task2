package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> blockA.filterIsInstance<Int>().reduce { acc, next -> acc + next }
            String::class -> blockA.filterIsInstance<String>().reduce { acc, next -> acc + next }
            LocalDate::class ->
                blockA.filterIsInstance<LocalDate>().max()
                    ?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
            else -> ""
        }
    }

}
