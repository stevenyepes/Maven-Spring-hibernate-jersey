package com.udea.iw.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Ciudad implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6944304325295905687L;
	
	long codigo;
	String nombre;
	String codigoDeArea;

	@XmlElement(required=true)
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	@XmlElement(required=true)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement(required=true)
	public String getCodigoDeArea() {
		return codigoDeArea;
	}
	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

}
