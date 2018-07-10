package com.BO;


import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Proyecto;
import com.entities.ProyectoUsuario;
/*import com.entities.Requisito;*/
import com.entities.Usuario;
import com.utils.HibernateUtil;

public class ProyectoBO {

	public void altaProyecto(Proyecto proyecto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(proyecto);
		transaction.commit();
		session.close();
	}
	
	public List<Proyecto> listProyecto(){
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
	
	public void borraProyecto(Proyecto proyecto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(proyecto);
		transaction.commit();
		session.close();
	}
	
	public List<Proyecto> selectProUser(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Proyecto> criteria = builder.createQuery(Proyecto.class);
		Root<Proyecto> proyectoRoot = criteria.from(Proyecto.class);
		Join<Proyecto, ProyectoUsuario> usuarioJoin = proyectoRoot.join("usuariosProyecto", JoinType.INNER);
		
		criteria.select(proyectoRoot).where(builder.equal(usuarioJoin.get("usuario.id_usuario"), usuario.getId_usuario()));
		
		Query<Proyecto> proyectos =session.createQuery(criteria);
		return (List<Proyecto>) proyectos.list();		

	}
	
}
