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
	

	public Anexo getAnexo(Anexo anexo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Anexo WHERE id_anexo=(:condicion)";
		Query<Anexo> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", anexo.getId_anexo());
		anexo = hqlQuery.uniqueResult();
		session.close();
		return anexo;
		
	}
	
	public List<Anexo> getAnexos(int idPrueba) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Anexo> hqlQuery = session.createQuery("FROM Anexo WHERE prueba.id_prueba = "+idPrueba);
		List<Anexo> anexos = hqlQuery.list();
		session.close();
		return anexos;
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
