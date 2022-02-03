package br.com.ficticiusclean.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ficticiusclean.api.model.Veiculo;
import java.util.List;

public interface VeiculoRepositorio extends JpaRepository<Veiculo, Integer> {

	@Query("SELECT "
			+ " new Veiculo( v.nome , "
			+ " v.marca, "
			+ " v.modelo, "
			+ " v.dataFabricacao, "
			+ " ( ( ?2 / v.consumoMedioCidade ) + ( ?3 / v.consumoMedioEstrada) ) AS totalCombustivelGasto, " 
			+ " ( ( ( ?2 / v.consumoMedioCidade ) + ( ?3 / v.consumoMedioEstrada ) ) * ?1 ) AS valorTotalConsumo) "
			+ " FROM Veiculo v "
			+ " ORDER BY valorTotalConsumo ASC "
		)
	public List<Veiculo> listarPorgasto(long precoGasolina, long totaKmPercorridoCidade, long totalKmPercorridoEstrada);
}