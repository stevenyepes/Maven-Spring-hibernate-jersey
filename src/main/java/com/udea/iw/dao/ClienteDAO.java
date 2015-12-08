package com.udea.iw.dao;

import java.util.List;

import com.udea.iw.dto.Cliente;
import com.udea.iw.exception.MyException;

public interface ClienteDAO {

	List<Cliente> consultarTodos() throws MyException;

	Cliente obtener(String cedula) throws MyException;
	
	void guardar(Cliente cliente) throws MyException;
	
	void update(Cliente cliente) throws MyException;
	
	void delete(Cliente cliente) throws MyException;
}
