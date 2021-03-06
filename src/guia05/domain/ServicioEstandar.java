package guia05.domain;

public class ServicioEstandar extends Servicio {
	private Double montoFijo;
	private Trabajador trabajador;
	
	//Constructor
	public ServicioEstandar(Double montoFijo, Trabajador trabajador, Oficio oficio) {
		super();
		super.setOficio(oficio);
		this.montoFijo = montoFijo;
		this.trabajador = trabajador;
	}
	
	//Getters and Setters
	public Double getMontoFijo() {
		return montoFijo;
	}
	public void setMontoFijo(Double montoFijo) {
		this.montoFijo = montoFijo;
	}
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
	//Methods
	@Override
	public double costo() {
		return montoFijo + (montoFijo * trabajador.getPorcentajeComision());
	}

}
