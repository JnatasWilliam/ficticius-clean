package br.com.ficticiusclean.api.dto;

import javax.validation.constraints.NotNull;

import br.com.ficticiusclean.api.model.Combustivel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Salva preço e kilometragem")
@Data
public class CombustivelResponseDTO {

	@NotNull
	private double precoGasolina;

	@NotNull
	private double totaKmPercorridoCidade;

	@NotNull
	private double totalKmPercorridoEstrada;

	public static CombustivelResponseDTO converterParaEntidade(Combustivel combustivel) {
		return new CombustivelResponseDTO(combustivel.getPrecoGasolina(), combustivel.getTotaKmPercorridoCidade(), combustivel.getTotalKmPercorridoEstrada());
	}

	public CombustivelResponseDTO(double precoGasolina, double totaKmPercorridoCidade,
			double totalKmPercorridoEstrada) {
		this.precoGasolina = precoGasolina;
		this.totaKmPercorridoCidade = totaKmPercorridoCidade;
		this.totalKmPercorridoEstrada = totalKmPercorridoEstrada;
	}
}
