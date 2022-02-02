package br.com.ficticiusclean.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "veiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
	
	@Transient
	private Long total;
	
	@Transient
	private Long totalConsumo;

	public Veiculo(String nome, Long total, Long totalConsumo) {
		this.nome = nome;
		this.total = total;
		this.totalConsumo = totalConsumo;
	}
}