package com.actions;

import java.util.List;

import com.BO.ProyectoBO;
import com.BO.UsuarioBO;
import com.entities.Proyecto;
import com.entities.Usuario;
import com.opensymphony.xwork2.ActionSupport;

public class ProyectoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Proyecto proyecto ;
	private Usuario usuario ;
	private List<Proyecto> proyectos ;
	
	public String altaPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyectoBO.altaProyecto(proyecto);
		return SUCCESS;
	}
	
	public String consultaPrAc() {
		ProyectoBO proyectoBO = new ProyectoBO();
		proyectos = proyectoBO.listProyecto();
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
		proyectoBO.borraProyecto(proyecto);
		return SUCCESS;
	}
	
	public String listPrUsAc() {
		//ProyectoBO proyectoBO = new ProyectoBO();
		UsuarioBO usuarioBO = new UsuarioBO();
		
		Usuario usuario1 = new Usuario();
		usuario1.setId_usuario(6);
		
		usuario = usuarioBO.getUsuario(usuario1);
		
		//proyectoBO.selectProUser(usuario);
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
