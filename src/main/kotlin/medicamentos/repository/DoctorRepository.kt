package medicamentos.repository

import medicamentos.model.Doctor
import org.springframework.data.jpa.repository.JpaRepository

interface DoctorRepository: JpaRepository<Doctor, Long> {
    fun findById (id:Long?):Doctor?
}