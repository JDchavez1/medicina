
Create VIEW add_VIEW AS
select P.*, D.especialidad Doctor from Paciente P JOIN Doctor D ON D.id = P.id_Doctor;