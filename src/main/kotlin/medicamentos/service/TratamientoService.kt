package medicamentos.service

import medicamentos.repository.PacienteRepository
import medicamentos.repository.TratamientoRepository
import medicamentos.model.Tratamiento
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class TratamientoService {
    @Autowired
    lateinit var tratamientoRepository: TratamientoRepository
    @Autowired
    lateinit var pacienteRepository: PacienteRepository


    fun list(): List<Tratamiento> {

        return tratamientoRepository.findAll()
    }
    fun save (tratamiento: Tratamiento): Tratamiento {
        try{
            pacienteRepository.findById(tratamiento.idPaciente)
                ?: throw Exception("Paciente no encotrado")

            if (tratamiento.descripcion.equals("")){
                throw Exception("No se ha llenado la descripcion")
            }else{
                return tratamientoRepository.save(tratamiento)
            }
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message
            )
        }
    }
}