package com.udea.iw.dto;

import java.io.Serializable;

public class Direccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6896246127873412316L;
	DireccionID id;
	String direccion;
	String telefono;
	String ciudad;
	Boolean preferido;
	
	public DireccionID getId() {
		return id;
	}
	public void setId(DireccionID id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Boolean getPreferido() {
		return preferido;
	}
	public void setPreferido(Boolean preferido) {
		this.preferido = preferido;
	}
	
	
	
}
