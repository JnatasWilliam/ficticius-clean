package br.com.ficticiusclean.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ficticiusclean.api.model.Previsao;

public interface PrevisaoRepositorio extends JpaRepository<Previsao, Integer> {
	
}
