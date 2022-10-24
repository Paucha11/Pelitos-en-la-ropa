package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Cliente;
import com.edu.unab.repository.ClienteRepository;


@Service
public class ClienteServiceslmpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	

	@Override
	@Transactional (readOnly = true)
	public Iterable<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> findbyId(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id);
	}

	@Override
	public Cliente save(Cliente c) {
		// TODO Auto-generated method stub
		return clienteRepository.save(c);
	}

	@Override
	public void deleteById(Integer id) {
		
		clienteRepository.deleteById(id);
	}

}
