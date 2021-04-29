package guia05.exceptions;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("Tiene 2 o mas alquileres sin entregar");
	}
}
