package br.com.ficticiusclean.api.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ficticiusclean.api.model.Previsao;
import br.com.ficticiusclean.api.servicos.PrevisaoServico;
import io.swagger.v3.oas.annotations.Operation;

//@RestController
//@RequestMapping("/previsao")
public class PrevisaoControlador {
//	@Autowired
//	private PrevisaoServico previsaoServico;
//	
//	@Operation(summary = "Demonstra a previsão dos gastos", description = "Demonstração da previsão")
//	@GetMapping("/{codigoPrevisao}")
//	public ResponseEntity<Optional<Previsao>> listaPorID(@PathVariable Integer codigoPrevisao, Previsao previsao){
//		Optional<Previsao> buscaConsumo = previsaoServico.buscarPrevisaoPorCodigo(codigoPrevisao);
//		return buscaConsumo.isPresent() ? ResponseEntity.ok(buscaConsumo) : ResponseEntity.notFound().build();
//	}
}
