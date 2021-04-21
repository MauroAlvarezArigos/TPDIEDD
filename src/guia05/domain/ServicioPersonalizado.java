package guia05.domain;

public class ServicioPersonalizado extends Servicio {
	private Double presupuesto;
	private Double materiales;
	private Double transporte;
	
	@Override
	public double costo() {
		return presupuesto + materiales + transporte; 
	}

}
