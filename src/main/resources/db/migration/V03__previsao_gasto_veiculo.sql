CREATE TABLE previsao (	
	cod_previsao INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	marca VARCHAR(30) NOT NULL,
	modelo VARCHAR(30) NOT NULL, 
	ano DATE NOT NULL,
	quantidade_combustive_gasto BIGINT NOT NULL,
	valor_total_gasto BIGINT NOT NULL,
	codigo_veiculo INT NOT NULL,
	FOREIGN KEY (codigo_veiculo) REFERENCES veiculo(cod_veiculo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8