package com.mx.example.spring.boot.web.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.mx.example.spring.boot.web.app.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
