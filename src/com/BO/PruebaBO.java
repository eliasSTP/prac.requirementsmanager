package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Prueba;
import com.utils.HibernateUtil;

public class PruebaBO {
	
	public void altaPrueba(Prueba prueba) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(prueba);
		transaction.commit();
		session.close();
	}
	
	public List<Prueba> listPrueba(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Prueba");
		List<Prueba> pruebas = hqlQuery.list();
		session.close();
		return pruebas;
	}
	
	public Prueba getPrueba(Prueba prueba) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Prueba where id=(:condicion)";
		Query<Prueba> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", prueba.getId_prueba());
		prueba = hqlQuery.uniqueResult();
		session.close();
		return prueba;
		
	}
	
	public void actualizaPrueba(Prueba prueba) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(prueba);
		transaction.commit();
		session.close();

	}
	
	public void borraPrueba(Prueba prueba) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(prueba);
		transaction.commit();
		session.close();
	}

}
