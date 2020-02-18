CREATE TABLE usuario(
  idUsuario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username VARCHAR(128) NOT NULL,
  email VARCHAR(128) NOT NULL,
  PASSWORD VARCHAR(128) NOT NULL	
)ENGINE = INNODB;

INSERT INTO usuario VALUES (0, 'Edwin Tumax','edwintumax@gmail.com', MD5('123'));

SELECT * FROM usuario

CALL sp_Autenticar('edwintumax@gmail.com','123')

