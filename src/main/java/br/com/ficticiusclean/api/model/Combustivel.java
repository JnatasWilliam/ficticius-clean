package br.com.ficticiusclean.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "combustivel")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Combustivel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCombustivel;
	
	@Column(name = "preco_gasolina")
	private int precoGasolina;
	
	@Column(name = "total_km_percorrigo_C")
	private int totaKmPercorrigoCidade;
	
	@Column(name = "total_km_percorrigo_e")
	private int totalKmPercorrigoEstrada;
}
