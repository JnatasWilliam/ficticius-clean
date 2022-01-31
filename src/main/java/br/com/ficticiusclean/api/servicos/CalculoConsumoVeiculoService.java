package br.com.ficticiusclean.api.servicos;

import org.springframework.stereotype.Service;

import br.com.ficticiusclean.api.utils.RetornoKmPercorrido;

@Service
public class CalculoConsumoVeiculoService {

	public double[] caclularPrecoGasolinaPorKmEmCidade() {
		
		RetornoKmPercorrido retornokmPercorrido = new RetornoKmPercorrido();
		
		return retornokmPercorrido.calcularConsumoVeiculo();
	}
}
