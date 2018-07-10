package com.actions;

import java.util.List;

import com.BO.PerfilBO;
import com.entities.Perfil;
import com.opensymphony.xwork2.ActionSupport;

public class PerfilAction extends ActionSupport  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Perfil perfil ;
	private List<Perfil> perfiles ;
	
	public String altaPeAc() {
		PerfilBO perfilBO = new PerfilBO();
		perfilBO.altaPerfil(perfil);
		return SUCCESS;
	}
	
	public String consultaPeAc() {
		PerfilBO perfilBO = new PerfilBO();
		perfiles = perfilBO.listPerfiles();
		return SUCCESS;
	}
	
	public String inicioModificacionPeAc() {
		PerfilBO perfilBO = new PerfilBO();
		perfil = perfilBO.getPerfil(perfil);
		return SUCCESS;
		
	}
	
	public String modificaPeAc() {
		PerfilBO perfilBO = new PerfilBO();
		perfilBO.actualizaPerfil(perfil);
		return SUCCESS;
	}
	
	public String borraPeAc() {
		PerfilBO perfilBO = new PerfilBO();
		perfilBO.borraPerfil(perfil);
		return SUCCESS;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
