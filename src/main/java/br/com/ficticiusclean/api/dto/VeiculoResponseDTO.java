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
	
	private double valorTotalAGastar;
	
	private long totalAConsumir;

	public static VeiculoResponseDTO converterParaVeiculoDTO(Veiculo veiculo) {
		return new VeiculoResponseDTO(veiculo.getNome(), veiculo.getMarca(), veiculo.getModelo(),
				veiculo.getDataFabricacao(), veiculo.getValorTotalAGastar(), veiculo.getTotalAConsumir());
	}
 
	public VeiculoResponseDTO(String nome, String marca, String modelo, Date dataFabricacao, double valorTotalAGastar, long totalAConsumir) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.valorTotalAGastar = valorTotalAGastar;
		this.totalAConsumir = totalAConsumir;
	}
}
