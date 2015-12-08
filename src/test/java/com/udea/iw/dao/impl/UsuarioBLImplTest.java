package com.udea.iw.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.udea.iw.exception.MyException;
import com.udea.iw.logica.UsuarioBL;
import com.udea.iw.validations.Cifrar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springcfg.xml")

@Transactional

public class UsuarioBLImplTest {

	@Autowired
	UsuarioBL usuarioBL;
	
	@Test
	public void testValidar() throws MyException {
		
		Cifrar cifrar = new Cifrar();
		
		assertTrue(usuarioBL.validar("steven", "zxc456zxc"));
	}

}
