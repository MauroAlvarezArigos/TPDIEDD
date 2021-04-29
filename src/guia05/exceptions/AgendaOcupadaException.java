package guia05.exceptions;

public class AgendaOcupadaException extends Exception{
	public AgendaOcupadaException() {
		super("El trabajador no puede realizar el trabajo, porque ya tiene un trabajo en esa fecha");
	}
}
