CREATE TABLE combustivel (
	cod_combustivel INT PRIMARY KEY AUTO_INCREMENT,
	preco_gasolina DECIMAL NOT NULL,
	total_km_percorrido_C INT NOT NULL,
	total_km_percorrido_e INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO combustivel (preco_gasolina, total_km_percorrido_C, total_km_percorrido_e) VALUES (4, 100, 100);