package medicamentos.model

import javax.persistence.*

@Entity
@Table(name = "Tratamiento")

class TratamientoView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?=null
    var descripcion:String?=null
    @Column(name="Paciente_id")
    var idPaciente:Long?=null
    @Column(name="Doctor_id")
    var idDoctor:Long?=null
}