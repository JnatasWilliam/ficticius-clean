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
	@Column(name = "cod_combustivel")
	private Integer codigoCombustivel;

	@Column(name = "preco_gasolina")
	private double precoGasolina;

	@Column(name = "total_km_percorrido_C")
	private double totaKmPercorridoCidade;

	@Column(name = "total_km_percorrido_e")
	private double totalKmPercorridoEstrada;

	public Combustivel() {

	}

	public Combustivel(double precoGasolina, double totaKmPercorridoCidade, double totalKmPercorridoEstrada) {
		this.precoGasolina = precoGasolina;
		this.totaKmPercorridoCidade = totaKmPercorridoCidade;
		this.totalKmPercorridoEstrada = totalKmPercorridoEstrada;
	}
	

	public Combustivel(Integer codigoCombustivel, double precoGasolina, double totaKmPercorridoCidade, double totalKmPercorridoEstrada) {
		this.precoGasolina = precoGasolina;
		this.totaKmPercorridoCidade = totaKmPercorridoCidade;
		this.totalKmPercorridoEstrada = totalKmPercorridoEstrada;
	}
}