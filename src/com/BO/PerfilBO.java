package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Perfil;
import com.utils.HibernateUtil;

public class PerfilBO {
	
	public void altaPerfil(Perfil perfil) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(perfil);
		transaction.commit();
		session.close();
	}
	
	public List<Perfil> listPerfil(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Perfil");
		List<Perfil> perfiles = hqlQuery.list();
		session.close();
		return perfiles;
	}
	
	public Perfil getPerfil(Perfil perfil) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Perfil where id=(:condicion)";
		Query<Perfil> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", perfil.getId_perfil());
		perfil = hqlQuery.uniqueResult();
		session.close();
		return perfil;
		
	}
	
	public void actualizaPerfil(Perfil perfil) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(perfil);
		transaction.commit();
		session.close();

	}
	
	public void borraPerfil(Perfil perfil) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(perfil);
		transaction.commit();
		session.close();
	}

}
