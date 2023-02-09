package medicamentos.controller

import medicamentos.model.Paciente

import medicamentos.model.PacienteView

import medicamentos.service.PacienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pac")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class PacienteController {
    @Autowired
    lateinit var pacienteService: PacienteService

    @GetMapping
    fun list(): List<Paciente>{
        return pacienteService.list()
    }
    @GetMapping("/view/pac")
    fun listpaciente(): List<PacienteView>{
        return pacienteService.listpaciente()
    }
    @PostMapping
    fun  save (@RequestBody paciente: Paciente): Paciente {
        return pacienteService.save(paciente)
    }
}