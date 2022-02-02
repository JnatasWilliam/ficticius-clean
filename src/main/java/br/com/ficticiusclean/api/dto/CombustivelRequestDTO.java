package br.com.ficticiusclean.api.dto;

import javax.validation.constraints.NotNull;

import br.com.ficticiusclean.api.model.Combustivel;

public class CombustivelRequestDTO {
	
	@NotNull
	private double precoGasolina;

	@NotNull
	private double totaKmPercorridoCidade;

	@NotNull
	private double totalKmPercorridoEstrada;
	
	public Combustivel converterParaEntidade() {
		return new Combustivel();
	}
}
