package br.com.ficticiusclean.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ficticiusclean.api.model.Combustivel;

public interface CombustivelRepositorio extends JpaRepository<Combustivel, Integer> {

}
