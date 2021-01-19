package com.mx.example.spring.boot.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.example.spring.boot.web.app.entity.Cliente;
import com.mx.example.spring.boot.web.app.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
	private ClienteRepository clienteRepsository;
	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Cliente>)clienteRepsository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
      clienteRepsository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
	return clienteRepsository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
    clienteRepsository.deleteById(id);

	}

}
