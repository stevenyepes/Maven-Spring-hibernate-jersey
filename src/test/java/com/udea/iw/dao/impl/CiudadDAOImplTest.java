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

import com.udea.iw.dao.CiudadDAO;
import com.udea.iw.dto.Ciudad;
import com.udea.iw.exception.MyException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springcfg.xml")

@Transactional

public class CiudadDAOImplTest {

	@Autowired
	CiudadDAO ciudadDAO;
	
	@Test
	public void testConsultar() throws MyException {
		List <Ciudad> ciudades = new ArrayList<Ciudad>();
		ciudades = ciudadDAO.consultar();
		
		assertTrue(ciudades.size()>0);
	}

}
