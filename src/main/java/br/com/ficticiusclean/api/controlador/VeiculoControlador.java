package br.com.ficticiusclean.api.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ficticiusclean.api.model.Veiculo;
import br.com.ficticiusclean.api.servicos.VeiculoServico;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/veiculo")
public class VeiculoControlador {
	
	@Autowired
	private VeiculoServico veiculoServico;
	
	@Operation(summary = "Lista veiculos", description = "Retorna todos os veiculos")
	@GetMapping
	public List<Veiculo> listarVeiculos(){
		return veiculoServico.listaVeiculos();
	}
	
	@Operation(summary = "Lista veiculos por id", description = "Retorna todos os veiculos por id")
	@GetMapping("/{codigoVeiculo}")
	public ResponseEntity<Optional<Veiculo>> listaPorID(@PathVariable Integer codigoVeiculo){
		Optional<Veiculo> veiculo = veiculoServico.listaPorID(codigoVeiculo);
		return veiculo.isPresent() ? ResponseEntity.ok(veiculo) : ResponseEntity.notFound().build();
	}
	
	@Operation(summary = "Cadastro veiculos", description = "Cadastro de novos veiculos")
	@PostMapping
	public ResponseEntity<Veiculo> cadastrarVeiculo(@RequestBody Veiculo veiculo){
		Veiculo cadastroVeiculo = veiculoServico.salvar(veiculo);
		return ResponseEntity.status(HttpStatus.CREATED).body(cadastroVeiculo);
		
	}
}
