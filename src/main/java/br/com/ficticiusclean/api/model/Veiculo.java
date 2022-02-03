package br.com.ficticiusclean.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Builder;
import lombok.Data;
    
@Entity
@Table(name = "veiculo")
@Data
@Builder
public class Veiculo {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_veiculo")
	Integer codigoVeiculo;

	@Column(name = "nome")
	private String nome; 
  
	@Column(name = "marca")
	private String marca;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "data_fabricacao")
	private Date dataFabricacao;

	@Column(name = "consumo_medio_c")
	private double consumoMedioCidade;

	@Column(name = "consumo_medio_e")
	private double consumoMedioEstrada;

	@Transient
	private double valorTotalAGastar;

	@Transient
	private double totalAConsumir;
     
    	
	public Veiculo(String nome, String marca, String modelo, Date dataFabricacao, double totalAConsumir,
			double valorTotalAGastar) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.valorTotalAGastar = valorTotalAGastar;
		this.totalAConsumir = totalAConsumir;
	}

	public Veiculo(Integer codigoVeiculo, String nome, String marca, String modelo, Date dataFabricacao, double consumoMedioCidade,
			double consumoMedioEstrada) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.consumoMedioCidade = consumoMedioCidade;
		this.consumoMedioEstrada = consumoMedioEstrada;
	}

	public Veiculo(Integer codigoVeiculo, String nome, String marca, String modelo, Date dataFabricacao,
			double consumoMedioCidade, double consumoMedioEstrada, double valorTotalAGastar, double totalAConsumir) {
		super();
		this.codigoVeiculo = codigoVeiculo;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.consumoMedioCidade = consumoMedioCidade;
		this.consumoMedioEstrada = consumoMedioEstrada;
		this.valorTotalAGastar = valorTotalAGastar;
		this.totalAConsumir = totalAConsumir;
	}
}