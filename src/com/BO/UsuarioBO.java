package com.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Usuario;
import com.utils.HibernateUtil;

public class UsuarioBO {
	
	public void altaUsuario(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(usuario);
		transaction.commit();
		session.close();
	}
	
	public List<Usuario> listUsuario(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM Usuario");
		List<Usuario> usuarios = hqlQuery.list();
		session.close();
		return usuarios;
	}
	
	public Usuario getUsuario(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Usuario WHERE id_usuario=(:condicion)";
		Query<Usuario> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", usuario.getId_usuario());
		usuario = hqlQuery.uniqueResult();
		session.close();
		return usuario;
		
	}
	
	public void actualizaUsuario(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(usuario);
		transaction.commit();
		session.close();

	}
	
	public void borraUsuario(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(usuario);
		transaction.commit();
		session.close();
	}
	
}
