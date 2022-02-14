package com.agencia.viagem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viagens")
public class ViagemController {
	
	@Autowired
	private RepositorioViagem repositorioViagem;
	
	@GetMapping
	public List<Viagem> listarViagens(){
		return repositorioViagem.findAll();
	}
	
	@PostMapping
	@ResponseStatus
	public Viagem adicionaViagem(@RequestBody Viagem viagem) {
		return repositorioViagem.save(viagem);
	}
	
}