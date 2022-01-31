CREATE TABLE combustivel (
	cod_combustivel INT PRIMARY KEY AUTO_INCREMENT,
	preco_gasolina DECIMAL NOT NULL,
	total_km_percorrigo_C INT NOT NULL,
	total_km_percorrigo_e INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;