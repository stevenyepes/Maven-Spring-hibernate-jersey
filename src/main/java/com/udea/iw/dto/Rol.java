package com.udea.iw.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4141159213768450390L;
	String codigo;
	String nombre;
	@XmlElement(required=true)
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@XmlElement(required=true)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
