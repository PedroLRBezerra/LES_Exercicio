CREATE DATABASE		les_projeto
go 
USE les_projeto

CREATE TABLE usuario(
usuario VARCHAR(50) PRIMARY KEY NOT NULL,
nome VARCHAR(150) NOT NULL,
email VARCHAR(100) NOT NULL,
senha VARCHAR(100) NOT NULL,
tipo VARCHAR(15))

create TABLE curso(
codigo INT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
desciricao VARCHAR(MAX),
duracao VARCHAR(30),
situacao bit not null,
usuario_dono VARCHAR(50)
FOREIGN KEY (usuario_dono) REFERENCES usuario(usuario))

INSERT INTO usuario VALUES
('cole','Leandro','x@x.com','123','PROFESSOR'),
('guiref','Guilherme','x@x.com','123','ALUNO'),
('Raj','Pedro','x@x.com','123','ADM')

select * from usuario