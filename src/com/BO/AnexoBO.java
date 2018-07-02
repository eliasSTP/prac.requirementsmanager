package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Anexo;
import com.utils.HibernateUtil;

public class AnexoBO {
	
	public void altaAnexo(Anexo anexo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(anexo);
		transaction.commit();
		session.close();
	}
	
	public List<Anexo> listAnexo(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Anexo");
		List<Anexo> anexos = hqlQuery.list();
		session.close();
		return anexos;
	}
	
	public Anexo getAnexo(Anexo anexo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Anexo where id=(:condicion)";
		Query<Anexo> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", anexo.getId_anexo());
		anexo = hqlQuery.uniqueResult();
		session.close();
		return anexo;
		
	}
	
	public void actualizaAnexo(Anexo anexo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(anexo);
		transaction.commit();
		session.close();

	}
	
	public void borraAnexo(Anexo anexo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(anexo);
		transaction.commit();
		session.close();
	}

}
