SELECT * FROM alumno;
SELECT * FROM curso;

INSERT INTO curso (descripcion) VALUES ('Informática');
SELECT * FROM curso;
SELECT * FROM alumno_curso;

INSERT INTO alumno_curso VALUES (1,1,'2018-03-24');
SELECT * FROM alumno_curso;
SELECT * FROM curso;

INSERT INTO alumno_curso VALUES (2,1,'2018-03-24');
SELECT * FROM alumno_curso;
SELECT * FROM curso;


