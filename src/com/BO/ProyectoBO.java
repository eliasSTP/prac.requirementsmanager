package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Proyecto;
import com.utils.HibernateUtil;

public class ProyectoBO {

	public void alta(Proyecto proyecto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(proyecto);
		transaction.commit();
		session.close();
	}
	
	public List<Proyecto> list(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Proyecto");
		List<Proyecto> proyectos = hqlQuery.list();
		session.close();
		return proyectos;
	}
	
	public Proyecto getProyecto(Proyecto proyecto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Proyecto where id=(:condicion)";
		Query<Proyecto> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", proyecto.getId_proyecto());
		proyecto = hqlQuery.uniqueResult();
		session.close();
		return proyecto;
		
	}
	
	public void actualizaProyecto(Proyecto proyecto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(proyecto);
		transaction.commit();
		session.close();

	}
	
	public void borra(Proyecto proyecto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(proyecto);
		transaction.commit();
		session.close();
	}
}
