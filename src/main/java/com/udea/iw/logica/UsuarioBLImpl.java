package com.udea.iw.logica;

import com.udea.iw.dao.UsuarioDAO;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.MyException;
import com.udea.iw.validations.Cifrar;

public class UsuarioBLImpl implements UsuarioBL {

	UsuarioDAO usuarioDAO;
	
	
	public boolean validar(String usuario, String password) throws MyException {
		
		Usuario usuarioDTO;
		Cifrar cifrar = new Cifrar();
		
			if(usuario==null || usuario.isEmpty()){
				throw new MyException("sdasd", null);
			}
			
			usuarioDTO = usuarioDAO.consultar(usuario);
			if(usuarioDTO == null) {
				
				return false;
			}
			
			if(!cifrar.encrypt(password).equals(usuarioDTO.getContrasena())) {
				return false;
			}

		return true;
		
		
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}
