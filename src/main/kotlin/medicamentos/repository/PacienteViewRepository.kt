package medicamentos.repository


import medicamentos.model.PacienteView
import org.springframework.data.jpa.repository.JpaRepository

interface PacienteViewRepository: JpaRepository<PacienteView, Long> {
    fun findById (id:Long?):PacienteView?
}