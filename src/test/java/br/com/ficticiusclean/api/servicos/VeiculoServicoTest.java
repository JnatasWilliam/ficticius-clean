package br.com.ficticiusclean.api.servicos;
 
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import br.com.ficticiusclean.api.dto.VeiculoRequestDTO;
import br.com.ficticiusclean.api.dto.VeiculoResponseDTO;
import br.com.ficticiusclean.api.dto.PrevisaoDTO;
 
public class VeiculoServicoTest {
	
	@InjectMocks 
	private VeiculoServico veiculoServico;
	 
	@Test
	public void verificaSeOsDadosResponseEstaoVazios () {
		VeiculoResponseDTO dto = VeiculoResponseDTO.builder()
				.nome("Fusca")
				.modelo("Volks")
				.marca("1975")
				.dataFabricacao(new Date())
				.valorTotalAGastar(1412.7272727272727)
				.totalAConsumir(201.8181818181818)
				.build();
		
		assertNotNull(dto);
	}

	@Test
	public void verificaSeOsDadosRequestEstaoVazios () {
		VeiculoRequestDTO dto = VeiculoRequestDTO.builder()
				.nome("Volvo")
				.modelo("Volks")
				.marca("1111")
				.dataFabricacao(new Date())
				.consumoMedioCidade(8)
				.consumoMedioEstrada(15)
				.build();
		
		assertNotNull(dto);
	}
	
	@Test
	public void verificaSePrevisaoEstaVazia () {
		PrevisaoDTO dto = PrevisaoDTO.builder()
				.precoGasolina(17.50)
				.totaKmPercorridoCidade(18)
				.totalKmPercorridoEstrada(150)
				.build();
		
		assertNotNull(dto);
	}
}