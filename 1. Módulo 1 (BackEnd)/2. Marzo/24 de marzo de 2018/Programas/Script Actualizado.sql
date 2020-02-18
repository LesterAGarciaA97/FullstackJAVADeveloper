SELECT CURDATE() AS fecha_actual
SELECT USER() AS usuario;
SELECT YEAR(CURDATE()) AS anio;
SELECT alumno.`carne`, alumno.`apellidos`, alumno.`nombres`, fn_Edad(alumno.`fecha_nacimiento`) AS edad FROM alumno;

SELECT * FROM sv_AlumnosPorEdad;
SELECT carne,edad FROM sv_AlumnosPorEdad;

SELECT * FROM curso
ALTER TABLE curso ADD COLUMN numero_alumno INT;

