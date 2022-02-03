package br.com.ficticiusclean.api.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import br.com.ficticiusclean.api.model.Veiculo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
          
@Schema(description = "Retorno veiculo")
@Data 
@Builder
public class VeiculoRequestDTO {
	@NotNull
	private String nome;
    
	@NotNull
    private String marca;

	@NotNull
	private String modelo;

	@NotNull
	private Date dataFabricacao;
	
	@NotNull
	private double consumoMedioCidade;

	@NotNull
	private double consumoMedioEstrada;
	
	public Veiculo converterParaEntidade() {
		return new Veiculo(null, nome,  marca, modelo, dataFabricacao, consumoMedioCidade,
				consumoMedioEstrada);
	}

}
