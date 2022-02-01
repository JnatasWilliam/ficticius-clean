package br.com.ficticiusclean.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"br.com.ficticiusclean.api.model"})
@EnableJpaRepositories(basePackages = {"br.com.ficticiusclean.api.repositorio"})
@ComponentScan(basePackages = {"br.com.ficticiusclean.api.servicos", "br.com.ficticiusclean.api.controlador", "br.com.ficticiusclean.api.utils"})
@SpringBootApplication
public class Application {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("### Quantidade de elementos por página = " + this.qtdPorPagina + " ###");
		};
	}

}