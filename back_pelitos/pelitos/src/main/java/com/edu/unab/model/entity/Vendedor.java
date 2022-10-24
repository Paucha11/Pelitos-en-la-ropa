package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Vendedor")
public class Vendedor {
	
	@Id
	@Column(name = "id_administrador")
	private Integer id_administrador;
	
	@Column(name = "nombre_completo")
	private String nombre;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "correo_electronico")
	private String correo_electronico;
	
	public Vendedor() {
		super();
	}

	public Vendedor(Integer id_vendedor, String nombre, String telefono, String dirección, String correo) {
		super();
		this.id_administrador = id_vendedor;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = dirección;
		this.correo_electronico = correo;
	}

	public Integer getId_vendedor() {
		return id_administrador;
	}

	public void setId_vendedor(Integer id_administrador) {
		this.id_administrador = id_administrador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDirección(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo_electronico;
	}

	public void setCorreo(String correo) {
		this.correo_electronico = correo;
	}

	@Override
	public String toString() {
		return "Vendedor [id_administrador=" + id_administrador + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion="
				+ direccion + ", correo=" + correo_electronico + "]";
	}
	
	
	

}
