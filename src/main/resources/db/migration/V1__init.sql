CREATE TABLE Doctor(
    id serial,
    nombre varchar(30) null,
    especialidad varchar(30)null,
    PRIMARY KEY (id)
);

CREATE TABLE Paciente(
    id serial,
    nombre varchar (30)null,
    edad int null,
    PRIMARY key (id),
    id_Doctor int null,
    FOREIGN key(id_Doctor)references Doctor(id)
);
