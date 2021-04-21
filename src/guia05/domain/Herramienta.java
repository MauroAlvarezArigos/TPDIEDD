package guia05.domain;

public class Herramienta {
	private String nombre;
	private Double costoXDia;
	
	//Constructor
	public Herramienta(String nombre, Double costo) {
		this.nombre = nombre;
		this.costoXDia = costo;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getCostoXDia() {
		return costoXDia;
	}
	public void setCostoXDia(Double costoXDia) {
		this.costoXDia = costoXDia;
	}
	
	
	
}
