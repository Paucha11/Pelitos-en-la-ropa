package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cliente")

public class Cliente {

	@Id
	@Column(name = "idCliente")
	private Integer idCliente;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Correo")
	private String correo;
	
	@Column(name = "Teléfono")
	private String teléfono;

	public Cliente() {
		
	}

	public Cliente(Integer idCliente, String nombre, String correo, String teléfono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.correo = correo;
		this.teléfono = teléfono;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", correo=" + correo + ", teléfono="
				+ teléfono + "]";
	}
	

}
