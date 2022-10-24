package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Vendedor;

public interface VendedorService {
	public Iterable<Vendedor> findAll();
	public Optional<Vendedor> findbyId(Integer id);
	public Vendedor save(Vendedor v);
	public void deleteById (Integer id);
		
		
	
 
}
