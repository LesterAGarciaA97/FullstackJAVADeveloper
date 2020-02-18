DELIMITER $$

USE `sga2018`$$

DROP PROCEDURE IF EXISTS `sp_ConsultaProfesores`$$

CREATE DEFINER=`lestergarcia`@`localhost` PROCEDURE `sp_ConsultaProfesores`()
BEGIN
	SELECT
	 profesor.`codigo_profesor`, profesor.`nombres`, profesor.`apellidos`, profesor.`fecha_nacimiento`,  profesor.`puesto`, profesor.`numero_periodos` FROM profesor;
    END$$

DELIMITER ;