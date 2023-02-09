package medicamentos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MedicamentosApplication

fun main(args: Array<String>) {
	runApplication<MedicamentosApplication>(*args)
}
