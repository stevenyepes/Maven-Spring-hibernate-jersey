package com.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.udea.iw.dao.CiudadDAO;
import com.udea.iw.dto.Ciudad;
import com.udea.iw.exception.MyException;

public class CiudadDAOImpl extends HibernateDaoSupport implements CiudadDAO {

	
	public List<Ciudad> consultar() throws MyException {
		
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		org.hibernate.Session session = null;
		try {

			session =getSession();
			Criteria criteria = session.createCriteria(Ciudad.class);
			ciudades = criteria.list();

		} catch (HibernateException e) {

			throw new MyException(e);

		} /*finally {
			try{
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				
				throw new MyException(e);
			}
			
			
		}*/

		return ciudades;
	}

}
