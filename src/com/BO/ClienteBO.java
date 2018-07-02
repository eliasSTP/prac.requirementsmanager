package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.utils.HibernateUtil;
import com.entities.Cliente;

public class ClienteBO {

	public void altaCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cliente);
		transaction.commit();
		session.close();
	}
	
	public List<Cliente> listClientes(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Cliente");
		List<Cliente> clientes = hqlQuery.list();
		session.close();
		return clientes;
	}
	
	public Cliente getCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Cliente where id=(:condicion)";
		Query<Cliente> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", cliente.getId_cliente());
		cliente = hqlQuery.uniqueResult();
		session.close();
		return cliente;
		
	}
	
	public void actualizaCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(cliente);
		transaction.commit();
		session.close();

	}
	
	public void borraCliente(Cliente cliente) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(cliente);
		transaction.commit();
		session.close();
	}
	
}
