package com.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.udea.iw.dao.UsuarioDAO;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.MyException;

public class UsuarioDAOImpl  extends HibernateDaoSupport implements UsuarioDAO {

	
	public List<Usuario> consultarTodos() throws MyException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		org.hibernate.Session session = null;
		try {

			session =getSession();
			Criteria criteria = session.createCriteria(Usuario.class);
			usuarios = criteria.list();

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

		return usuarios;
	}

	
	public Usuario consultar(String login) throws MyException {
		Usuario usuario = new Usuario();
		org.hibernate.Session session = null;
		try {

			session = getSession();
			//Criteria criteria = session.createCriteria(Usuario.class, );
			usuario = (Usuario) session.get(Usuario.class, login);

		} catch (HibernateException e) {

			throw new MyException(e);

		}
		
		return usuario;
	}

	
	public boolean guardar(Usuario usuario) throws MyException {
		boolean isSaved = false;
		Session session = null;
		Transaction tr = null;
		try {
			session = getSession();
			// Guarda el objeto
			// Inicia la transaccion
			tr = (Transaction) session.beginTransaction();
			session.save(usuario);
			if (!tr.wasCommitted())
			    tr.commit();
			
		} catch (HibernateException e) {
			throw new MyException(e);
		} finally {
			
			tr.rollback();
			isSaved = true;
		
		}
		
		return isSaved;

		
	}

}
