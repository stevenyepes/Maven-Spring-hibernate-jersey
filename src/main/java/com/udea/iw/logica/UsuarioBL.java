package com.udea.iw.logica;

import com.udea.iw.exception.MyException;

public interface UsuarioBL {

	public boolean validar(String usuario, String password) throws MyException;
}
