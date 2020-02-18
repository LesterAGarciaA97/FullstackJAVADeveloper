DELIMITER $$

USE `sga2018`$$

DROP PROCEDURE IF EXISTS `sp_ConsultaAlumnos`$$

CREATE DEFINER=`lestergarcia`@`localhost` PROCEDURE `sp_ConsultaAlumnos`()
BEGIN
	SELECT
	 alumno.`carne`, alumno.`apellidos`, alumno.`nombres`, alumno.`fecha_nacimiento`, alumno.`codigo_carrera`, carrera.`descripcion` FROM alumno INNER JOIN carrera ON alumno.`codigo_carrera` = carrera.`codigo_carrera`;
    END$$

DELIMITER ;