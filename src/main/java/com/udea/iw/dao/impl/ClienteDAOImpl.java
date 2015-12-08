package com.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.udea.iw.dao.ClienteDAO;
import com.udea.iw.dto.Cliente;
import com.udea.iw.exception.MyException;

public class ClienteDAOImpl extends HibernateDaoSupport implements ClienteDAO {

	
	public List<Cliente> consultarTodos() throws MyException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session = null;
		try {

			session = getSession();
			Criteria criteria = session.createCriteria(Cliente.class);
			clientes = criteria.list();

		} catch (HibernateException e) {

			throw new MyException(e);

		}
		return clientes;
	}

	
	public Cliente obtener(String cedula) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void guardar(Cliente cliente) throws MyException {
		Session session = null;
		try {
			session = getSession();
			// Guarda el objeto
			// Inicia la transaccion
			Transaction tr = (Transaction) session.beginTransaction();
			session.save(cliente);
			tr.commit();
		} catch (HibernateException e) {
			throw new MyException(e);
		} finally {
			try {
				if (session != null) {
					session.close();
				}
			} catch (HibernateException e) {
				throw new MyException(e);
			}
		}

	}

	
	public void update(Cliente cliente) throws MyException {
		// TODO Auto-generated method stub

	}

	
	public void delete(Cliente cliente) throws MyException {
		// TODO Auto-generated method stub

	}

}
