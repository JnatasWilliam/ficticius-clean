package br.com.ficticiusclean.api.dto;

import javax.validation.constraints.NotNull;

import br.com.ficticiusclean.api.model.Combustivel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Atualização de preco e Km percorrido")
@Data
public class CombustivelRequestDTO {

	@NotNull
	private double precoGasolina;

	@NotNull
	private double totaKmPercorridoCidade;

	@NotNull
	private double totalKmPercorridoEstrada;

	public Combustivel converterParaEntidade() {
		return new Combustivel(precoGasolina, precoGasolina, precoGasolina);
	}

	public Combustivel converterParaEntidade(Integer codigoCombustivel) {
		return new Combustivel(precoGasolina, totaKmPercorridoCidade, totalKmPercorridoEstrada);
	}
}
