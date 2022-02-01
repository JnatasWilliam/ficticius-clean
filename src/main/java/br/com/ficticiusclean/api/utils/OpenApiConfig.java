package br.com.ficticiusclean.api.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	 @Bean
	  public OpenAPI ficticiusAPI() {
	      return new OpenAPI()
	              .info(new Info().title("Ficticius Clean API")
	              .description("Sistema de previsao de gasto de combustivel")
	              .version("v0.0.1"));
	  }
}