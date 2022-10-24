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

import com.edu.unab.model.entity.Vendedor;
import com.edu.unab.model.service.VendedorService;

@RestController
@RequestMapping("/api/vendedor")
public class VendedorController {
	
	@Autowired
	private VendedorService vendedorservice;
	

	
	@PostMapping
	
	public Vendedor guardar(@RequestBody Vendedor vendedor) {
		
		return vendedorservice.save(vendedor);
	}
	
	

	@GetMapping("/{id}")
	public Optional<Vendedor>buscarPorId(@PathVariable Integer id){
		
		return vendedorservice.findbyId(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Vendedor>listarTodos(){
		
		return vendedorservice.findAll();
		
	}
	
	
	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		vendedorservice.deleteById(id);
		
	}
}