package medicamentos.repository

import medicamentos.model.Paciente
import org.springframework.data.jpa.repository.JpaRepository

interface PacienteRepository: JpaRepository<Paciente, Long> {
    fun findById (id:Long?):Paciente?
}