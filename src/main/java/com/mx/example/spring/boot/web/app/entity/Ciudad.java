package com.mx.example.spring.boot.web.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="ciudades")
public class Ciudad implements Serializable{
	@Override
	public String toString() {
		return "Ciudad [Id=" + Id + ", ciudad=" + ciudad + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String ciudad;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	

}
