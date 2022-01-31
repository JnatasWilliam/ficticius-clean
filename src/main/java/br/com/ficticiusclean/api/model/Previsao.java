package br.com.ficticiusclean.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "previsao")
@Data
public class Previsao{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoPrevisao;
	
	@Column(name = "quantidade_combustive_gasto")
	private Long quantidadeCombustiveGasto;
	
	@Column(name = "valor_total_gasto")
	private Long valorTotalGasto;
	
	@ManyToOne
	@JoinColumn(name = "codigo_veiculo", referencedColumnName = "cod_veiculo" )
	private Veiculo veiculo;
}
