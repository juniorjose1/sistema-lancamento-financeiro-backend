	CREATE TABLE IF NOT EXISTS categoria(
		id BIGINT(20) PRIMARY KEY AUTO_INCREMENT NOT NULL,
		nome VARCHAR(50) NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
	INSERT INTO categoria (nome) values ('Lazer');
	INSERT INTO categoria (nome) values ('Alimentação');
	INSERT INTO categoria (nome) values ('Supermercado');
	INSERT INTO categoria (nome) values ('Farmácia');
	INSERT INTO categoria (nome) values ('Outros');