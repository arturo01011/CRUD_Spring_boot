package com.mx.example.spring.boot.web.app.service;

import com.mx.example.spring.boot.web.app.entity.Cliente;

import java.util.List;


public interface IClienteService {
	
	public List<Cliente> listarTodos();
	public void guardar(Cliente cliente);
	public Cliente buscarPorId(Long id);
	public void eliminar(Long id);
	 
	
	
}

