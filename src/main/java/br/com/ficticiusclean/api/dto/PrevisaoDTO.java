package br.com.ficticiusclean.api.dto;
         
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
 
@Schema(description = "Retorno de previsão de gasto")
@Data
@Builder 
public class PrevisaoDTO {
 	
	double precoGasolina;
	double totaKmPercorridoCidade; 
	double totalKmPercorridoEstrada;
}
