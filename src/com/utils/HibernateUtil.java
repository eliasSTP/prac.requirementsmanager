package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entities.Anexo;
import com.entities.Cliente;
import com.entities.Perfil;
import com.entities.Proyecto;
import com.entities.Prueba;
import com.entities.Requisito;
import com.entities.Usuario;

public class HibernateUtil {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				registry = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources sources = new MetadataSources(registry);
				
				sources.addAnnotatedClass(Cliente.class);
				sources.addAnnotatedClass(Proyecto.class);
				sources.addAnnotatedClass(Requisito.class);
				sources.addAnnotatedClass(Usuario.class);
				sources.addAnnotatedClass(Perfil.class);
				sources.addAnnotatedClass(Prueba.class);
				sources.addAnnotatedClass(Anexo.class);
				
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}

}
