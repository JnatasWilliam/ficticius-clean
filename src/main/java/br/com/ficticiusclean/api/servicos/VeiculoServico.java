package br.com.ficticiusclean.api.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ficticiusclean.api.model.Veiculo;
import br.com.ficticiusclean.api.repositorio.VeiculoRepositorio;

@Service
public class VeiculoServico {
	
	@Autowired
	private VeiculoRepositorio veiculoRepositorio;
	
	public List<Veiculo> listaVeiculos(){
		return veiculoRepositorio.findAll();
	}
	
	public Optional<Veiculo> listaPorID(Integer codigoVeiculo){
		return veiculoRepositorio.findById(codigoVeiculo);
	}
}
