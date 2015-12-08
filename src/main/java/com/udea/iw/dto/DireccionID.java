package com.udea.iw.dto;

import java.io.Serializable;

public class DireccionID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5498460678029047440L;
	Long codigo;
	Cliente cliente;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
