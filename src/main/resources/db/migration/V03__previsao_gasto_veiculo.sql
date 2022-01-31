CREATE TABLE previsao (	
	cod_previsao INT PRIMARY KEY AUTO_INCREMENT,
	quantidade_combustive_gasto BIGINT NOT NULL,
	valor_total_gasto BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8