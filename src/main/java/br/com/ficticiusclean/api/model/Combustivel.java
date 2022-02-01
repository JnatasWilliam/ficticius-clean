package br.com.ficticiusclean.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "combustivel")
@Data
public class Combustivel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_combustivel")
	private Integer codigoCombustivel;
	
	@Column(name = "preco_gasolina")
	private double precoGasolina;
	
	@Column(name = "total_km_percorrido_C")
	private int totaKmPercorridoCidade;
	
	@Column(name = "total_km_percorrido_e")
	private int totalKmPercorridoEstrada;
}