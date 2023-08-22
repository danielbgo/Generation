CREATE DATABASE db_RH;
USE db_RH;

CREATE TABLE tb_colaboradores(
id bigint auto_increment,
nome varchar(255) not null,
sexo varchar(20),
idade int(255),
telefone int(255) not null,
salario decimal(6,3),
PRIMARY KEY (id)
);

INSERT INTO tb_colaboradores(nome,sexo,idade,telefone) values ("Daniel Beserra", "Masculino", 27, 1398887878, 3.000);
INSERT INTO tb_colaboradores(nome,sexo,idade,telefone) values ("Maria Joaquina", "Feminino", 36, 113833838, 5.000);
INSERT INTO tb_colaboradores(nome,sexo,idade,telefone) values ("Carlos Alberto", "Masculino", 50, 13899868, 1.800);
INSERT INTO tb_colaboradores(nome,sexo,idade,telefone) values ("Neymar Santos", "Masculino", 33, 13986756538, 2.000);
INSERT INTO tb_colaboradores(nome,sexo,idade,telefone) values ("Marta Maria", "Feminino", 25, 138827684, 7.000);


SELECT * FROM tb_colaboradores;

SELECT * FROM tb_colaboradores WHERE salario>2.000;
SELECT * FROM tb_colaboradores WHERE salario<2.000;
