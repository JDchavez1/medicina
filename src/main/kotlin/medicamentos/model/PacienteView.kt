package medicamentos.model

import javax.persistence.*

@Entity
@Table(name = "add_VIEW")

class PacienteView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?=null
    var nombre:String?=null
    var edad:Long?=null
    @Column(name="id_Doctor")
    var idDoctor:Long?=null
    var especialidad:String?=null
}