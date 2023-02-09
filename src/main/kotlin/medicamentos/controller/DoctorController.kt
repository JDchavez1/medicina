package medicamentos.controller

import medicamentos.model.Doctor
import medicamentos.service.DoctorService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/doctor")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class DoctorController {
    @Autowired
    lateinit var doctorService: DoctorService

    @GetMapping
    fun list(): List<Doctor>{
        return doctorService.list()
    }
    @PostMapping
    fun  save (@RequestBody doctor: Doctor): Doctor {
        return doctorService.save(doctor)
    }
    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Long): Boolean?{
        return doctorService.delete(id)
    }
}