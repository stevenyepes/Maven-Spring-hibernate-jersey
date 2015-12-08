package com.udea.iw.dao;

import java.util.List;

import com.udea.iw.dto.Cliente;
import com.udea.iw.dto.Direccion;
import com.udea.iw.exception.MyException;

public interface DireccionDAO {

	List<Direccion> consultarTodos(Cliente cliente) throws MyException;

	void guardar(Direccion direccion) throws MyException;
	
	void actualizar(Direccion direccion) throws MyException;
	
	void eliminar(Direccion direccion) throws MyException;
}
