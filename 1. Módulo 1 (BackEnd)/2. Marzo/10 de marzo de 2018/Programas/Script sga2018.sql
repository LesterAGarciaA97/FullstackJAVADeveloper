-- Creación de la base de datos
CREATE DATABASE sga2018;
USE sga2018;
-- Crear tabla carrera
CREATE TABLE carrera
(
  codigo_carrera INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(128) NOT NULL
)ENGINE = INNODB;
-- Crear tabla alumno
CREATE TABLE alumno
(
  codigo_alumno INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  apellidos VARCHAR(256) NOT NULL,
  nombres VARCHAR (256) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  carne VARCHAR (10) NOT NULL,
  codigo_carrera INT NOT NULL,
  CONSTRAINT FK_carrera_alumno FOREIGN KEY (codigo_carrera) REFERENCES carrera(codigo_carrera)
)ENGINE = INNODB;

-- Codigo para eliminar tablas --> DROP TABLE carrera;

-- Crear tabla curso
CREATE TABLE curso 
(
  codigo_curso INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(256) NOT NULL
)ENGINE = INNODB;
-- Crear tabla profesor
CREATE TABLE profesor
(
  codigo_profesor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  apellidos VARCHAR(128) NOT NULL,
  nombres VARCHAR(128) NOT NULL,
  puesto VARCHAR(128) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  numero_periodos INT NOT NULL DEFAULT 0
)ENGINE = INNODB;
-- Crear tabla profesor curso
CREATE TABLE profesor_curso
(
  codigo_profesor INT NOT NULL,
  codigo_curso INT NOT NULL,
  fecha_asignacion DATE NOT NULL,
  CONSTRAINT FK_profesor_curso FOREIGN KEY (codigo_profesor) REFERENCES profesor(codigo_profesor),
  CONSTRAINT FK_curso_profesor FOREIGN KEY (codigo_curso) REFERENCES curso(codigo_curso)
)ENGINE = INNODB;

-- Crear tabla alumno curso
CREATE TABLE alumno_curso
(
  codigo_alumno INT NOT NULL,
  codigo_curso INT NOT NULL,
  fecha_asignacion DATE NOT NULL,
  CONSTRAINT FK_alumno_curso FOREIGN KEY (codigo_alumno) REFERENCES alumno(codigo_alumno),
  CONSTRAINT FK_curso_alumno FOREIGN KEY (codigo_curso) REFERENCES curso(codigo_curso)
)ENGINE = INNODB;