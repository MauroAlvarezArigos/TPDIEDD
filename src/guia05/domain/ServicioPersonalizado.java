package guia05.domain;

public class ServicioPersonalizado extends Servicio {
	private Double presupuesto;
	private Double materiales;
	private Double transporte;
	
	//Constructor
	public ServicioPersonalizado(Oficio oficio, Double presupuesto, Double materiales, Double transporte) {
		super();
		super.setOficio(oficio);
		this.presupuesto = presupuesto;
		this.materiales = materiales;
		this.transporte = transporte;
	}
	
	//Getters and Setters
	public Double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public Double getMateriales() {
		return materiales;
	}
	public void setMateriales(Double materiales) {
		this.materiales = materiales;
	}
	public Double getTransporte() {
		return transporte;
	}
	public void setTransporte(Double transporte) {
		this.transporte = transporte;
	}
	
	//Methods
	@Override
	public double costo() {
		return presupuesto + materiales + transporte; 
	}


}
