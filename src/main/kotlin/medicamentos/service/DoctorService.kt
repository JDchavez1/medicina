package medicamentos.service

import medicamentos.model.Doctor
import medicamentos.repository.DoctorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class DoctorService {
    @Autowired
    lateinit var doctorRepository: DoctorRepository


    fun list(): List<Doctor> {

        return doctorRepository.findAll()
    }
    fun save (doctor: Doctor): Doctor {
        try{
            if (doctor.nombre.equals("")){
                throw Exception("No se ha llenado el nombre")
            }
            if (doctor.especialidad.equals("")){
                throw Exception("No se ha llenado la especialidad")
            }else{
                return doctorRepository.save(doctor)
            }
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message
            )
        }
    }
    fun delete (id:Long):Boolean?{
        doctorRepository.findById(id)?:
        throw Exception()
        doctorRepository.deleteById(id!!)
        return true
    }
}