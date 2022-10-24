package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Vendedor;
import com.edu.unab.repository.VendedorRepository;

@Service
public class VendedorServicesImpl implements VendedorService {
	
	@Autowired
	private VendedorRepository vendedorRepository;
	

	@Override
	@Transactional (readOnly = true)
	public Iterable<Vendedor> findAll() {
		// TODO Auto-generated method stub
		return vendedorRepository.findAll();
	}

	@Override
	public Optional<Vendedor> findbyId(Integer id) {
		// TODO Auto-generated method stub
		return vendedorRepository.findById(id);
	}

	@Override
	public Vendedor save(Vendedor v) {
		// TODO Auto-generated method stub
		return vendedorRepository.save(v);
	}

	@Override
	public void deleteById(Integer id) {
		
		vendedorRepository.deleteById(id);
	}

}
