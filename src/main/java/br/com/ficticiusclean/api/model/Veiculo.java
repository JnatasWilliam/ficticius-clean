package br.com.ficticiusclean.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "veiculo")
@Data
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
	private long consumoMedioCidade;

	@Column(name = "consumo_medio_e")
	private long consumoMedioEstrada;

	public Veiculo() {
		
	}

	public Veiculo(String nome, String marca, String modelo, Date dataFabricacao, long consumoMedioCidade,
			long consumoMedioEstrada) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.consumoMedioCidade = consumoMedioCidade;
		this.consumoMedioEstrada = consumoMedioEstrada;
	}
}