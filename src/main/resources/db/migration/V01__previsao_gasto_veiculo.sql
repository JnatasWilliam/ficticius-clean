CREATE TABLE previsao (	
	cod_previsao INT(50) PRIMARY KEY AUTO_INCREMENT,
	quantidade_combustive_gasto BIGINT NOT NULL,
	valor_total_gasto BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO previsao (quantidade_combustive_gasto, valor_total_gasto) VALUES ("0", "0");