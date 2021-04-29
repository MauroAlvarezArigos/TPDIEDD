package guia05.domain;

import java.util.ArrayList;

import guia05.exceptions.AgendaOcupadaException;
import guia05.exceptions.OficioNoCoincideException;

public class Trabajador {
	
	private Oficio oficio;
	private String nombre;
	private String email;
	private Double costoXHora;
	private Double porcentajeComision;
	private ArrayList<Trabajo> trabajosAsignados; 
	
	//Constructor
	public Trabajador(Oficio oficio, String nombre, String email, Double costoXHora, Double porcentajeComision) {
		super();
		this.oficio = oficio;
		this.nombre = nombre;
		this.email = email;
		this.costoXHora = costoXHora;
		this.porcentajeComision = porcentajeComision;
		this.trabajosAsignados = new ArrayList<Trabajo>();
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getCostoXHora() {
		return costoXHora;
	}
	public void setCostoXHora(Double costoXHora) {
		this.costoXHora = costoXHora;
	}
	public Double getPorcentajeComision() {
		return porcentajeComision;
	}
	public void setPorcentajeComision(Double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	
	//Methods
	public void AsignarTrabajo(Trabajo unTrabajo) {
		try {
			if(this.verificarOficio(unTrabajo.getServicio()) && this.verificarFecha(unTrabajo)) {    
                trabajosAsignados.add(unTrabajo);
			}                                                      
		}
		catch(OficioNoCoincideException e) {
			e.printStackTrace();
		}
		catch(AgendaOcupadaException e) {
			e.printStackTrace();
		}
	}

	private Boolean verificarFecha(Trabajo unTrabajo) throws AgendaOcupadaException {
		for(Trabajo t : trabajosAsignados) {
			if(t.getFechaInicio().isEqual(unTrabajo.getFechaInicio())) {
				throw new AgendaOcupadaException();
			}
		}
		return true;
	}
	
	private Boolean verificarOficio(Servicio unServicio) throws OficioNoCoincideException{
		if((unServicio.getOficio()).equals(this.oficio)) {
			return true;
		}		
		else throw new OficioNoCoincideException("El trabajador es "+ (unServicio.getOficio()).getNombre());
	}
	
}
