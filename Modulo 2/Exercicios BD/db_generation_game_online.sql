CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_personagens (
  id INT PRIMARY KEY auto_increment,
  nomePersonagem VARCHAR(255) NOT NULL,
  nivel INT,
  vida DECIMAL(10,2),
  ataque DECIMAL(10,2),
  defesa DECIMAL(10,2) 
);
CREATE TABLE tb_classes (
  id INT PRIMARY KEY auto_increment,
  nome VARCHAR(255) NOT NULL
);
ALTER TABLE tb_personagens ADD classe int;
ALTER TABLE tb_personagens ADD CONSTRAINT fk_classe FOREIGN KEY(classe) REFERENCES tb_classes(id);

INSERT INTO tb_classes(nome) VALUES("Guerreiro");
INSERT INTO tb_classes(nome) VALUES("Mago");
INSERT INTO tb_classes(nome) VALUES("Druida");
INSERT INTO tb_classes(nome) VALUES("Arqueiro");
INSERT INTO tb_classes(nome) VALUES("Feiticeiro");
SELECT * FROM tb_classes;

INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Joaozinho",10,8.000,2.000,1.000,1);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Mariazinha",9,10.000,4.000,2.000,2);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Renatinha",10,9.000,4.000,3.000,1);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Gabrielzinho",6,5.000,2.000,1.000,3);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Jorgezinho",3,3.000,1.000,3.000,4);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Valeriazinha",10,10.000,5.000,5.000,5);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Danielzinho",10,10.000,4.000,3.000,2);
INSERT INTO tb_personagens(nomePersonagem,nivel,vida,ataque,defesa,classe) VALUES("Luizinho",9,9.000,4.000,2.000,4);
SELECT * FROM tb_personagens;

SELECT * FROM tb_personagens WHERE ataque > 2.000;
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1.000 AND 2.000;
SELECT * FROM tb_personagens WHERE nomePersonagem LIKE"c%";
SELECT nomePersonagem,nivel,vida,ataque,defesa,classe FROM tb_personagens INNER JOIN tb_classes;
SELECT nomePersonagem, nivel,vida,ataque,defesa,classe FROM tb_personagens INNER JOIN tb_classes ON classe WHERE nomePersonagem = "Arqueiro";
