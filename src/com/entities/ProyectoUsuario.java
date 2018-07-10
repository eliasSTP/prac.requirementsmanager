package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProyectoUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_proyecto_usuario ;
	
	@ManyToOne
	private Proyecto proyecto ;
	
	@ManyToOne
	private Usuario usuario ;

	public int getId_proyecto_usuario() {
		return id_proyecto_usuario;
	}

	public void setId_proyecto_usuario(int id_proyecto_usuario) {
		this.id_proyecto_usuario = id_proyecto_usuario;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	
	
}
