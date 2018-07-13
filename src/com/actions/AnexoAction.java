package com.actions;

import java.util.List;

import com.BO.AnexoBO;
import com.BO.PruebaBO;
import com.entities.Anexo;
import com.entities.Prueba;
import com.opensymphony.xwork2.ActionSupport;

public class AnexoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Anexo anexo ;
	private List<Anexo> anexos ;
	private Prueba prueba;
	private int idPrueba ;
	
	public String altaAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexoBO.altaAnexo(anexo);
		return SUCCESS;
	}
	
	public String inicioModificacionAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexo = anexoBO.getAnexo(anexo);
		return SUCCESS;
		
	}
	
	public String modificaAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexoBO.actualizaAnexo(anexo);
		return SUCCESS;
	}
	
	public String borraAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexoBO.borraAnexo(anexo);
		return SUCCESS;
	}
	
	public String listAnTestAc() {
		PruebaBO pruebaBO = new PruebaBO();
		Prueba prueba1 = new Prueba();
		prueba1.setId_prueba(idPrueba);
		prueba = pruebaBO.getPrueba(prueba1);
		return SUCCESS;
	}

	public Anexo getAnexo() {
		return anexo;
	}

	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}

	public List<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public int getIdPrueba() {
		return idPrueba;
	}

	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}
	
	
}
