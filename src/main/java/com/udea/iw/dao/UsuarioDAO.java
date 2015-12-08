package com.udea.iw.dao;

import java.util.List;

import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.MyException;

public interface UsuarioDAO {

	public List<Usuario> consultarTodos() throws MyException;
	public Usuario consultar(String login) throws MyException;
	public boolean guardar(Usuario usuario) throws MyException; 
}
