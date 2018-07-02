package com.actions;

import java.util.List;

import com.BO.PruebaBO;
import com.entities.Prueba;
import com.opensymphony.xwork2.ActionSupport;

public class PruebaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Prueba prueba ;
	private List<Prueba> pruebas ;
	
	public String altaTestAc() {
		PruebaBO pruebaBO = new PruebaBO();
		pruebaBO.altaPrueba(prueba);
		return SUCCESS;
	}
	
	public String consultaTestAc() {
		PruebaBO pruebaBO = new PruebaBO();
		pruebas = pruebaBO.listPrueba();
		return SUCCESS;
	}
	
	public String inicioModificacionTestAc() {
		PruebaBO pruebaBO = new PruebaBO();
		prueba = pruebaBO.getPrueba(prueba);
		return SUCCESS;
		
	}
	
	public String modificaTestAc() {
		PruebaBO pruebaBO = new PruebaBO();
		pruebaBO.actualizaPrueba(prueba);
		return SUCCESS;
	}
	
	public String borraTestAc() {
		PruebaBO pruebaBO = new PruebaBO();
		pruebaBO.borraPrueba(prueba);
		return SUCCESS;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public List<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(List<Prueba> pruebas) {
		this.pruebas = pruebas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
