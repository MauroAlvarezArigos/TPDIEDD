package guia05.domain;

public class Oficio {
	private String nombre;
	private ServicioEstandar estandar;
	
	
	//Constructors
	public Oficio(String nombre, ServicioEstandar estandar) {
		super();
		this.nombre = nombre;
		this.estandar = estandar;
	}
	public Oficio(String nombre) {
		super();
		this.nombre = nombre;
		this.estandar = null;
	}
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ServicioEstandar getEstandar() {
		return estandar;
	}
	public void setEstandar(ServicioEstandar estandar) {
		this.estandar = estandar;
	}
	
	//Methods
	public Boolean equals(Oficio unOficio) {
		if(this.nombre == unOficio.getNombre()) {
			return true;
		}
		return false;
	}
}
