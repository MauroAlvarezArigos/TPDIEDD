package guia05.domain;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("Tiene 2 o mas alquileres sin entregar");
	}
}
