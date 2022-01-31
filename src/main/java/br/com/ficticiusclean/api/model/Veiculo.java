package br.com.ficticiusclean.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	protected String nome;
	
	@Column(name = "marca")
	protected String marca;
	
	@Column(name = "modelo")
	protected String modelo;
	
	@Column(name = "data_fabricacao")
	private Date dataFabricacao;
	
	@Column(name = "consumo_medio_c")
	private long consumoMedioCidade;
	
	@Column(name = "consumo_medio_e")
	private long consumoMedioEstrada;
}