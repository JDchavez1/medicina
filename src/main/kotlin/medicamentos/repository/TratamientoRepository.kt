package medicamentos.repository



import medicamentos.model.Tratamiento
import org.springframework.data.jpa.repository.JpaRepository

interface TratamientoRepository: JpaRepository<Tratamiento, Long> {
    fun findById (id:Long?): Tratamiento?
}