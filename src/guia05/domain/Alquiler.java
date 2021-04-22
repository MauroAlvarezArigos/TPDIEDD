package guia05.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Contratable {
	
	private Herramienta herramienta;
	private LocalDate fechaInicio;
	private LocalDate fechaEntrega;
	private LocalDate fechaDevolucion;
	
	//Constructor
	public Alquiler(Herramienta herramienta, LocalDate fechaInicio, LocalDate fechaEntrega) {
		super();
		this.herramienta = herramienta;
		this.fechaInicio = fechaInicio;
		this.fechaEntrega = fechaEntrega;
		this.fechaDevolucion = null;
	}
	public Alquiler() {
		super();
	}
	
	//Getters and Setters
	public Herramienta getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	//Methods
	@Override
	public Double costo() {
		if(finalizado()) {
			return herramienta.getCostoXDia() * ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);
		}
		else return herramienta.getCostoXDia() * ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
	}

	@Override
	public Boolean finalizado() {
		if(fechaDevolucion == null) {
			return false;
		}
		return true;
	}
	
	public Boolean enMora() {
		
		if(fechaDevolucion == null) {
			if(daysbtw(LocalDate.now(), fechaEntrega) < 0) {
				//You still have time to return it on time
				return true;
			}
			else return false;
		}
		else if(daysbtw(fechaEntrega, fechaDevolucion) < 0) {
			//You don't return it on time
			return true;
		}
		else return false;
		
	}
	
	private long daysbtw(LocalDate fechaInicial, LocalDate fechaFinal) {
		return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
	}
}
