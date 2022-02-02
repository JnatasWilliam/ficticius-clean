package br.com.ficticiusclean.api.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import br.com.ficticiusclean.api.model.Veiculo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Retorno veiculo")
@Data
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
	private long consumoMedioCidade;

	@NotNull
	private long consumoMedioEstrada;
	
	public Veiculo converterParaEntidade() {
		return new Veiculo(nome,  marca, modelo, dataFabricacao, consumoMedioCidade,
				consumoMedioEstrada);
	}

}
