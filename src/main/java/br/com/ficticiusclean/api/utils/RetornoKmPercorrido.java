package br.com.ficticiusclean.api.utils;

import java.util.Date;

import br.com.ficticiusclean.api.model.Combustivel;
import br.com.ficticiusclean.api.model.Veiculo;

public class RetornoKmPercorrido {
	
	public double[] calcularConsumoVeiculo() {
		
		Veiculo veiculo = new Veiculo();

		veiculo.setNome("Piore");
		veiculo.setModelo("Volks");
		veiculo.setMarca("2002");
		veiculo.setDataFabricacao(new Date());
		veiculo.setConsumoMedioEstrada(10);
		veiculo.setConsumoMedioCidade(12);

		Combustivel gasolina = new Combustivel();

		gasolina.setPrecoGasolina(7.99);
		gasolina.setTotalKmPercorrigoEstrada(15);
		gasolina.setTotaKmPercorrigoCidade(12);

		double consumoMedioE = gasolina.getTotalKmPercorrigoEstrada() / veiculo.getConsumoMedioEstrada();
		double consumoMedioC = gasolina.getTotaKmPercorrigoCidade() / veiculo.getConsumoMedioCidade();
		
		return new double[] {consumoMedioE, consumoMedioC};
	}	
}
