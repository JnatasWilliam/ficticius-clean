package br.com.ficticiusclean.api.servicos;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.ficticiusclean.api.model.Combustivel;
import br.com.ficticiusclean.api.model.Previsao;
import br.com.ficticiusclean.api.model.Veiculo;
import br.com.ficticiusclean.api.repositorio.CombustivelRepositorio;
import br.com.ficticiusclean.api.repositorio.PrevisaoRepositorio;

@Service
public class PrevisaoServico {
	@Autowired
	private PrevisaoRepositorio previsaoRepositorio;
	
	@Autowired
	private CombustivelRepositorio combustivelRespositorio;

	public Optional<Previsao> buscarPrevisaoPorCodigo(Integer codigoPrevisao) {
		return previsaoRepositorio.findById(codigoPrevisao);
	}

	public Previsao atualizar(Integer codigoPrevisao, Previsao previsao) {
		Previsao previsaoSalvar = validarPrevisaoExiste(codigoPrevisao);
		previsaoSalvar = calcularConsumoVeiculo(codigoPrevisao);
		BeanUtils.copyProperties(previsao, previsaoSalvar, "codigoPrevisao");
		return previsaoRepositorio.save(previsaoSalvar);
	}

	private Previsao validarPrevisaoExiste(Integer codigoPrevisao) {
		Optional<Previsao> previsao = buscarPrevisaoPorCodigo(codigoPrevisao);
		if (previsao.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return previsao.get();
	}

	public Previsao calcularConsumoVeiculo(Integer codigoPrevisao) {

		Optional<Previsao> previsao = buscarPrevisaoPorCodigo(codigoPrevisao);
//		
//		@Query("SELECT total_km_percorrido_E FROM combustivel")
//		combustivelRespositorio.findBy;
//		
//		@Query("SELECT total_km_percorrido_C FROM combustivel")
//		
//		
//		previsao.get().setQuantidadeCombustiveGasto((gasolina.getTotalKmPercorridoEstrada() / veiculo.getConsumoMedioEstrada())
//						+ (gasolina.getTotaKmPercorridoCidade() / veiculo.getConsumoMedioCidade()));
//		
//		previsao.get().setValorTotalGasto((gasolina.getTotalKmPercorridoEstrada() / veiculo.getConsumoMedioEstrada())
//				+ (gasolina.getTotaKmPercorridoCidade() / veiculo.getConsumoMedioCidade())
//						* gasolina.getPrecoGasolina());
//		
		return previsao.get();
	}
}