CREATE
    VIEW `sga2018`.`sv_AlumnosPorEdad` 
    AS 
	(
	  SELECT alumno.`carne`, alumno.`apellidos`, alumno.`nombres`, fn_Edad(alumno.`fecha_nacimiento`) AS edad FROM alumno
	);
