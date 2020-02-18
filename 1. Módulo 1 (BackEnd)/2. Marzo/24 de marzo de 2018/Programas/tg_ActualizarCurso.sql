DELIMITER $$
CREATE
    TRIGGER `sga2018`.`tg_ActualizarCurso` AFTER INSERT
    ON `sga2018`.`alumno_curso`
    FOR EACH ROW BEGIN
	DECLARE _cantidad INT DEFAULT 0;
	SET _cantidad = (SELECT IFNULL (curso.`numero_alumno`,0) FROM curso WHERE curso.`codigo_curso` = new.codigo_curso);
	SET _cantidad = _cantidad + 1;
	UPDATE curso SET curso.`numero_alumno` = _cantidad WHERE curso.`codigo_curso` = new.codigo_curso;
    END$$
DELIMITER ;