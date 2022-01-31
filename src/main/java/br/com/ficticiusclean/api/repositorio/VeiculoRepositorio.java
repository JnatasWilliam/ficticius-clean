package br.com.ficticiusclean.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ficticiusclean.api.model.Veiculo;

public interface VeiculoRepositorio extends JpaRepository<Veiculo, Integer> {
	
}
