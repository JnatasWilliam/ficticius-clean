package br.com.ficticiusclean.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "combustivel")
@Data
public class Combustivel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoCombustivel;
	
	@Column(name = "preco_gasolina")
	private double precoGasolina;
	
	@Column(name = "total_km_percorrigo_C")
	private int totaKmPercorrigoCidade;
	
	@Column(name = "total_km_percorrigo_e")
	private int totalKmPercorrigoEstrada;
}