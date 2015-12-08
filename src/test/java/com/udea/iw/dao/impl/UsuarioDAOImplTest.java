package com.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.udea.iw.dao.RolDAO;
import com.udea.iw.dao.UsuarioDAO;
import com.udea.iw.dto.Rol;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.MyException;
import com.udea.iw.validations.Cifrar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springcfg.xml")

@Transactional(rollbackFor=Exception.class)


public class UsuarioDAOImplTest {

	@Autowired
	UsuarioDAO usuarioDAO;
	
	@Autowired
	RolDAO rolDAO;
	
	@Test
	public void testConsultarTodos() throws MyException {
		List <Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = usuarioDAO.consultarTodos();
		
		assertTrue(usuarios.size()>0);
		
	}

	@Test
	public void testConsultar() throws MyException {
		Usuario usuario = new Usuario();
		usuario = usuarioDAO.consultar("elver");
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getRol().getNombre());

		assertTrue(usuario!=null);
	}
	
	
	//@Test
	public void testGuardar() throws MyException {
		
		Cifrar cifrar = new Cifrar();
		Usuario usuario = new Usuario();
		usuario.setNombre("Pepito");
		usuario.setApellido("Peres");
		usuario.setLogin("pepitoPeres");
		Rol rol = rolDAO.consultarTodos().get(0);
		usuario.setRol(rol);
		
		usuario.setContrasena(cifrar.encrypt("zxc456zxc"));
		
		
		assertTrue(usuarioDAO.guardar(usuario));
	}

}
