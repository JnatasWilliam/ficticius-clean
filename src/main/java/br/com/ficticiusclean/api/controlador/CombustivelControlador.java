package br.com.ficticiusclean.api.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ficticiusclean.api.model.Combustivel;
import br.com.ficticiusclean.api.servicos.CombustivelServico;

@RestController
@RequestMapping("/combustivel")
public class CombustivelControlador {
	@Autowired
	private CombustivelServico combustivelServico;

	@PutMapping("/{codigoCombustivel}")
	public ResponseEntity<Combustivel> atualizar(@PathVariable Integer codigoCombustivel,
			@RequestBody Combustivel combustivel) {
		return ResponseEntity.ok(combustivelServico.atualizar(codigoCombustivel, combustivel));
	}

}
