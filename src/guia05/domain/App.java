package guia05.domain;

public class App {

	public static void main(String[] args) {
		Trabajador cacho = new Trabajador(null, "Cachito", null, 15.00, 0.15);
		ServicioEstandar unservicio = new ServicioEstandar(125.0, cacho); 
		Trabajo t = new Trabajo(cacho, unservicio, false, null);
		
		System.out.println(t.costo());
	}

}
