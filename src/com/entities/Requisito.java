package com.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Requisito {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_requisito ;
	private String descripcion_requisito ;
	private String historia ;
	private String valorador_horas ;
	private int valoracion_horas ;
	private String estado_requisito ;
	@ManyToOne
	private Proyecto proyecto ;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="requisito")
	private List<Prueba> pruebas ;
	
	
	public int getId_requisito() {
		return id_requisito;
	}
	public void setId_requisito(int id_requisito) {
		this.id_requisito = id_requisito;
	}
	public String getDescripcion_requisito() {
		return descripcion_requisito;
	}
	public void setDescripcion_requisito(String descripcion_requisito) {
		this.descripcion_requisito = descripcion_requisito;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public String getValorador_horas() {
		return valorador_horas;
	}
	public void setValorador_horas(String valorador_horas) {
		this.valorador_horas = valorador_horas;
	}
	public int getValoracion_horas() {
		return valoracion_horas;
	}
	public void setValoracion_horas(int valoracion_horas) {
		this.valoracion_horas = valoracion_horas;
	}
	public String getEstado_requisito() {
		return estado_requisito;
	}
	public void setEstado_requisito(String estado_requisito) {
		this.estado_requisito = estado_requisito;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
}
