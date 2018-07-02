package com.actions;

import java.util.List;

import com.BO.ProyectoBO;
import com.entities.Proyecto;
import com.opensymphony.xwork2.ActionSupport;

public class ProyectoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Proyecto proyecto ;
	private List<Proyecto> proyectos ;
	
	public String altaPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyectoBO.alta(proyecto);
		return SUCCESS;
	}
	
	public String consultaPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyectos = proyectoBO.list();
		return SUCCESS;
	}
	
	public String inicioModificacionPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyecto = proyectoBO.getProyecto(proyecto);
		return SUCCESS;
		
	}
	
	public String modificaPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyectoBO.actualizaProyecto(proyecto);
		return SUCCESS;
	}
	
	public String borraPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyectoBO.borra(proyecto);
		return SUCCESS;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
