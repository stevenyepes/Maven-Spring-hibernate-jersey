package com.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.udea.iw.dao.RolDAO;
import com.udea.iw.dto.Ciudad;
import com.udea.iw.dto.Rol;
import com.udea.iw.exception.MyException;

public class RolDAOImpl extends HibernateDaoSupport implements RolDAO {

	
	public List<Rol> consultarTodos() throws MyException {
		List<Rol> roles = new ArrayList<Rol>();
		org.hibernate.Session session = null;
		try {

			session =getSession();
			Criteria criteria = session.createCriteria(Rol.class);
			roles = criteria.list();

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

		return roles;
	}

}
