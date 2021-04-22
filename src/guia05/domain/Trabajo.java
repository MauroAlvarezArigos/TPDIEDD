package guia05.domain;

import java.time.LocalDate;

public class Trabajo implements Contratable {
	private Trabajador trabajador;
	private Servicio servicio;
	private Boolean urgente;
	private LocalDate fechaFin;
	
	//Constructor
	public Trabajo(Trabajador trabajador, Servicio servicio, Boolean urgente, LocalDate fechaFin) {
		super();
		this.trabajador = trabajador;
		this.servicio = servicio;
		this.urgente = urgente;
		this.fechaFin = null;
	}
	
	//Getters and Setters
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Boolean getUrgente() {
		return urgente;
	}
	public void setUrgente(Boolean urgente) {
		this.urgente = urgente;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	//Methods
	@Override
	public Double costo() {
		if(urgente) {
			return (0.5*servicio.costo()) + servicio.costo();
		}
		else return servicio.costo();
	}

	@Override
	public Boolean finalizado() {
		if(fechaFin == null) {
			return false;
		}
		else return true;
	}

}
