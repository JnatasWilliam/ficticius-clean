package br.com.ficticiusclean.api.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import br.com.ficticiusclean.api.model.Veiculo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Retorno veiculo")
@Data
public class VeiculoResponseDTO {
	@NotNull
	protected String nome;

	@NotNull
	protected String marca;

	@NotNull
	protected String modelo;

	@NotNull
	private Date dataFabricacao;
	
	private double totalCombustivelGasto;
	
	private double valorTotalConsumo;

	public static VeiculoResponseDTO converterParaVeiculoDTO(Veiculo veiculo) {
		return new VeiculoResponseDTO(veiculo.getNome(), veiculo.getMarca(), veiculo.getModelo(),
				veiculo.getDataFabricacao(), veiculo.getTotalCombustivelGasto(), veiculo.getValorTotalConsumo());
	}
 
	public VeiculoResponseDTO(String nome, String marca, String modelo, Date dataFabricacao, double totalCombustivelGasto, double valorTotalConsumo) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.totalCombustivelGasto = totalCombustivelGasto;
		this.valorTotalConsumo = valorTotalConsumo;
	}
}
