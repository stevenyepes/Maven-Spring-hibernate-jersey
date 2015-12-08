package com.udea.iw.dao;

import java.util.List;

import com.udea.iw.dto.Ciudad;
import com.udea.iw.dto.Rol;
import com.udea.iw.exception.MyException;

public interface RolDAO {
	
	public List<Rol> consultarTodos() throws MyException;
}
