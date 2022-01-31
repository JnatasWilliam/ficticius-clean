package br.com.ficticiusclean.api.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ficticiusclean.api.model.Veiculo;
import br.com.ficticiusclean.api.servicos.VeiculoServico;

@RestController
@RequestMapping("/veiculo")
public class VeiculoControlador {
	
	@Autowired
	private VeiculoServico veiculoServico;
	
	@GetMapping
	public List<Veiculo> listarVeiculos(){
		return veiculoServico.listaVeiculos();
	}
	
	@GetMapping("/{codigoVeiculo}")
	public ResponseEntity<Optional<Veiculo>> listaPorID(@PathVariable Integer codigoVeiculo){
		Optional<Veiculo> veiculo = veiculoServico.listaPorID(codigoVeiculo);
		return veiculo.isPresent() ? ResponseEntity.ok(veiculo) : ResponseEntity.notFound().build();
	}
}
