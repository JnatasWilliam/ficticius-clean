package br.com.ficticiusclean.api.dto;

import java.util.Date;


import br.com.ficticiusclean.api.model.Veiculo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Retorno veiculo")
@Data
public class NewVeiculoResponseDTO {

	private String nome;

	private String marca;

	private String modelo;

	private Date dataFabricacao;
	
	private double consumoMedioCidade;

	private double consumoMedioEstrada;
	
	public static NewVeiculoResponseDTO converterParaVeiculoDTO(Veiculo veiculo) {
		return new NewVeiculoResponseDTO(veiculo.getNome(), veiculo.getMarca(), veiculo.getModelo(),
				veiculo.getDataFabricacao(), veiculo.getConsumoMedioCidade(), veiculo.getConsumoMedioEstrada());
	}
 
	public NewVeiculoResponseDTO(String nome, String marca, String modelo, Date dataFabricacao, double consumoMedioCidade, double consumoMedioEstrada) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.consumoMedioCidade = consumoMedioCidade;
		this.consumoMedioEstrada = consumoMedioEstrada;
	}
}
