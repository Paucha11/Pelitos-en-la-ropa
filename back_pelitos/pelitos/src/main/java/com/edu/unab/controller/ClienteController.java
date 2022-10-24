package com.edu.unab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.unab.model.entity.Cliente;
import com.edu.unab.model.service.ClienteService;


@RestController
@RequestMapping("/api/cliente")

public class ClienteController {
	
	@Autowired
	private ClienteService clienteservice;
	

	
	@PostMapping
	
	public Cliente guardar(@RequestBody Cliente cliente) {
		
		return clienteservice.save(cliente);
	}

	@GetMapping("/{id}")
	public Optional<Cliente>buscarPorId(@PathVariable Integer id){
		
		return clienteservice.findbyId(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Cliente>listarTodos(){
		
		return clienteservice.findAll();
		
	}
	
	
	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		clienteservice.deleteById(id);
		
	}
}



