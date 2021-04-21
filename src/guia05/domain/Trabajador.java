package guia05.domain;

public class Trabajador {
	
	private Oficio oficio;
	private String nombre;
	private String email;
	private Double costoXHora;
	private Double porcentajeComision;
	
	//Constructor
	public Trabajador(Oficio oficio, String nombre, String email, Double costoXHora, Double porcentajeComision) {
		super();
		this.oficio = oficio;
		this.nombre = nombre;
		this.email = email;
		this.costoXHora = costoXHora;
		this.porcentajeComision = porcentajeComision;
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

	
}
