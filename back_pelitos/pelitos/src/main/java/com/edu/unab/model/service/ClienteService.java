package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Cliente;

public interface ClienteService {
	public Iterable<Cliente> findAll();
	public Optional<Cliente> findbyId(Integer id);
	public Cliente save(Cliente c);
	public void deleteById (Integer id);

}
