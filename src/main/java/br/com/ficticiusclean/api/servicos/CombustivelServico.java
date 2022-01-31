package br.com.ficticiusclean.api.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.ficticiusclean.api.model.Combustivel;
import br.com.ficticiusclean.api.repositorio.CombustivelRepositorio;

@Service
public class CombustivelServico {

	@Autowired
	private CombustivelRepositorio combustivelRespositorio;

	public Optional<Combustivel> buscarCombustivelPorCodigo(Integer codigoCombustivel) {
		return combustivelRespositorio.findById(codigoCombustivel);
	}

	public Combustivel atualizar(Integer codigoCombustivel, Combustivel combustivel) {
		Combustivel combustivelSalvar = validarCombustiveExiste(codigoCombustivel);
		BeanUtils.copyProperties(combustivel, combustivelSalvar, "codigoCombustivel");
		return combustivelRespositorio.save(combustivelSalvar);
	}

	private Combustivel validarCombustiveExiste(Integer codigoCombustivel) {
		Optional<Combustivel> combustivel = buscarCombustivelPorCodigo(codigoCombustivel);
		if (combustivel.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return combustivel.get();
	}

}
