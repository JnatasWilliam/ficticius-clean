package br.com.ficticiusclean.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Previsao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoPrevisao;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo; 
	
	@Column(name = "ano")
	private Date ano;
	
	@Column(name = "quantidade_combustive_gasto")
	private Long quantidadeCombustiveGasto;
	
	@Column(name = "valor_total_gasto")
	private Long valorTotalGasto;
	
	@ManyToOne
	@JoinColumn(name = "codigo_veiculo", referencedColumnName = "cod_veiculo") 
	private Veiculo codigoVeiculo;
}
