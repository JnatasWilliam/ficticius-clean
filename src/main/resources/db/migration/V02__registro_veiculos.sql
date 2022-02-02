CREATE TABLE veiculo (
	cod_veiculo INT(50) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	marca VARCHAR(30) NOT NULL,
	modelo VARCHAR(30) NOT NULL, 
	data_fabricacao DATE NOT NULL,
	consumo_medio_c BIGINT NOT NULL,
	consumo_medio_e BIGINT NOT NULL,
	codigo_previsao INT NOT NULL,
	FOREIGN KEY (codigo_previsao) REFERENCES previsao(cod_previsao)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO veiculo (nome, marca, modelo, data_fabricacao, consumo_medio_c, consumo_medio_e, codigo_previsao) VALUES ('Piore', 'Volks', '2002', STR_TO_DATE('29/01/2022', "%d/%m/%Y/"), 10, 12, 1);
INSERT INTO veiculo (nome, marca, modelo, data_fabricacao, consumo_medio_c, consumo_medio_e, codigo_previsao) VALUES ('Fusci', 'Volks', '2003', STR_TO_DATE('28/01/2022', "%d/%m/%Y/"), 10, 11, 1);
INSERT INTO veiculo (nome, marca, modelo, data_fabricacao, consumo_medio_c, consumo_medio_e, codigo_previsao) VALUES ('Palit', 'Fia', '2006', STR_TO_DATE('2/01/2022', "%d/%m/%Y/"), 10, 14, 1);
INSERT INTO veiculo (nome, marca, modelo, data_fabricacao, consumo_medio_c, consumo_medio_e, codigo_previsao) VALUES ('Weekend', 'fia', '2014', STR_TO_DATE('29/01/2021', "%d/%m/%Y/"), 10, 17, 1);
INSERT INTO veiculo (nome, marca, modelo, data_fabricacao, consumo_medio_c, consumo_medio_e, codigo_previsao) VALUES ('Toyoti', 'Corol', '20', STR_TO_DATE('29/01/2019', "%d/%m/%Y/"), 10, 10, 1);