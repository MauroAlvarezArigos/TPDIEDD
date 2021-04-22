package guia05.domain;

public abstract class Servicio {
	private Oficio oficio;
	public abstract double costo();
	
	
	public Oficio getOficio() {
		return oficio;
	}
	public void setOficio(Oficio unOficio) {
		this.oficio = unOficio;
	}
	
}
