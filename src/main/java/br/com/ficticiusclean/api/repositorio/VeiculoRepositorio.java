package br.com.ficticiusclean.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ficticiusclean.api.model.Veiculo;
import java.util.List;

public interface VeiculoRepositorio extends JpaRepository<Veiculo, Integer> {

	@Query("SELECT "
			+ " new Veiculo(nome , "
			+ " ((consumoMedioCidade * ?2) + (consumoMedioEstrada * ?3)) AS total, " 
			+ " ((consumoMedioCidade * ?1 * ?2 ) + (consumoMedioEstrada * ?1 * ?3)) AS totalConsumo) "
			+ " FROM Veiculo "
			+ " ORDER BY totalConsumo ASC "
		)
	public List<Veiculo> listarPorgasto(long precoGasolina, long totaKmPercorridoCidade, long totalKmPercorridoEstrada);
}