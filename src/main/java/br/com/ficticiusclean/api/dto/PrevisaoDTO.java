package br.com.ficticiusclean.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Retorno de previsão de gasto")
@Data
public class PrevisaoDTO {
	
	long precoGasolina;
	long totaKmPercorridoCidade; 
	long totalKmPercorridoEstrada;
}
