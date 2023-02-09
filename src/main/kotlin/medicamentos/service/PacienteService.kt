package medicamentos.service

import medicamentos.model.Paciente
import medicamentos.model.PacienteView
import medicamentos.repository.DoctorRepository
import medicamentos.repository.PacienteRepository
import medicamentos.repository.PacienteViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class PacienteService {
    @Autowired
    lateinit var pacienteRepository: PacienteRepository
    @Autowired
    lateinit var doctorRepository: DoctorRepository
    @Autowired
    lateinit var pacienteViewRepository:PacienteViewRepository


    fun list(): List<Paciente> {

        return pacienteRepository.findAll()
    }
    fun listpaciente(): List<PacienteView> {

        return pacienteViewRepository.findAll()
    }
    fun save (paciente: Paciente): Paciente {
        try{
            doctorRepository.findById(paciente.idDoctor)
              ?: throw Exception("Doctor no encotrado")

            if (paciente.nombre.equals("")){
                throw Exception("No se ha llenado el nombre")
            }else{
                return pacienteRepository.save(paciente)
            }
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message
            )
        }
    }
}