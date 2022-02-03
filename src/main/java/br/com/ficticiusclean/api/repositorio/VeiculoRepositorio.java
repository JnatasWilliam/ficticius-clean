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
			+ " ( ( ?2 / v.consumoMedioCidade ) + ( ?3 / v.consumoMedioEstrada) ) AS totalAConsumir, " 
			+ " ( ( ( ?2 / v.consumoMedioCidade ) + ( ?3 / v.consumoMedioEstrada ) ) * ?1 ) AS valorTotalAGastar) "
			+ " FROM Veiculo v "
			+ " ORDER BY valorTotalAGastar ASC "
		)
	public List<Veiculo> listarPorgasto(double precoGasolina, double totaKmPercorridoCidade, double totalKmPercorridoEstrada);
}