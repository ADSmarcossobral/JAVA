CREATE SEQUENCE seq_conta START 1;

CREATE TABLE conta(
	id_conta INT DEFAULT nextval('seq_conta'),
	nome varchar(255),
	saldo float,
	emUso boolean,
	tipo char,
	CONSTRAINT pk_id PRIMARY KEY (id_conta)
);

CREATE SEQUENCE seq_lancamento START 1;

CREATE TABLE lancamento(
	id_lancamento INT DEFAULT nextval('seq_lancamento'),
	descricao varchar(255),
	valor float,
	id_conta_credito INT NOT NULL,
	id_conta_debito INT NOT NULL,
	CONSTRAINT fk_id_conta_credito FOREIGN KEY (id_conta_credito) REFERENCES conta (id_conta),
	CONSTRAINT fk_id_conta_debito FOREIGN KEY (id_conta_debito) REFERENCES conta (id_conta)
);

INSERT INTO conta(nome, saldo, emUso, tipo)
VALUES ('Despesas', 0, true, 'B');

SELECT * 
FROM conta

UPDATE conta
SET id_conta = 1
WHERE id_conta = 3;

