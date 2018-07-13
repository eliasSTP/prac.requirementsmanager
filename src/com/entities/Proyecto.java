package com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_proyecto ;
	private String descripcion ;
	private Date fecha ;
	private String status ;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="proyecto")
	private List<ProyectoUsuario> usuariosProyecto ;
	

	public int getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ProyectoUsuario> getUsuariosProyecto() {
		return usuariosProyecto;
	}
	public void setUsuariosProyecto(List<ProyectoUsuario> usuariosProyecto) {
		this.usuariosProyecto = usuariosProyecto;
	}
}
