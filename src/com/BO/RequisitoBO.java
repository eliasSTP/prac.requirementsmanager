package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Requisito;
import com.utils.HibernateUtil;

public class RequisitoBO {
	
	public void alta(Requisito requisito) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(requisito);
		transaction.commit();
		session.close();
	}
	
	public List<Requisito> list(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Requisito");
		List<Requisito> requisitos = hqlQuery.list();
		session.close();
		return requisitos;
	}
	
	public Requisito getRequisito(Requisito requisito) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Requisito where id=(:condicion)";
		Query<Requisito> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", requisito.getId_requisito());
		requisito = hqlQuery.uniqueResult();
		session.close();
		return requisito;
		
	}
	
	public void actualizaRequisito(Requisito requisito) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(requisito);
		transaction.commit();
		session.close();

	}
	
	public void borra(Requisito requisito) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(requisito);
		transaction.commit();
		session.close();
	}

}
