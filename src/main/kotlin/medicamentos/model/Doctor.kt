package medicamentos.model

import javax.persistence.*

@Entity
@Table(name = "Doctor")

class Doctor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?=null
    var nombre:String?=null
    var especialidad:String?=null
}